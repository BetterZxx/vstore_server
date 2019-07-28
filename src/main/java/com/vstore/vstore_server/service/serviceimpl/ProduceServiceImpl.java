package com.vstore.vstore_server.service.serviceimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.vstore.vstore_server.bean.Product;
import com.vstore.vstore_server.bean.ProductExample;
import com.vstore.vstore_server.mapper.ProductMapper;
import com.vstore.vstore_server.service.serviceinter.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品服务类
 * @author LinYin
 * @date 2019-07-28 15:45
 */
@Service
public class ProduceServiceImpl implements ProductService {

	@Autowired
	private ProductMapper productMapper;

	private final static String NULL_VALUE = "NullValue";

	/**
	 * 获取所有商品
	 * @return 所有商品组成的数组
	 */
	@Override
	public PageInfo findAll(int pageNum, int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		List<Product> productList = productMapper.selectByExample(null);
		PageInfo<Product> pageInfo = new PageInfo<>(productList);
		return pageInfo;
	}

	/**
	 * 根据分页信息及查找条件返回数据
	 * @return 所有商品组成的数组
	 */
	@Override
	public PageInfo findAllByIdAndName(Integer pageNum, Integer pageSize, String productName, String productDesc){
		PageHelper.startPage(pageNum, pageSize);

		ProductExample example = new ProductExample();
		ProductExample.Criteria criteria = example.createCriteria();
		if (!NULL_VALUE.equals(productDesc)){
			criteria.andDespEqualTo(productDesc);
		}
		if (!NULL_VALUE.equals(productName)){
			criteria.andNameEqualTo(productName);
		}

		List<Product> productList = productMapper.selectByExample(example);
		PageInfo<Product> pageInfo = new PageInfo<>(productList);
		return pageInfo;
	}

	/**
	 * 添加商品
	 * @return 添加是否成功
	 */
	@Override
	public int addProduct(Product product){
		return productMapper.insert(product);
	}

	/**
	 * 更新商品
	 * @return 添加是否成功
	 */
	@Override
	public int updateProduct(Product product){
		return productMapper.updateByPrimaryKeySelective(product);
	}
}
