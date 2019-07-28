package com.vstore.vstore_server.service.serviceinter;

import com.github.pagehelper.PageInfo;
import com.vstore.vstore_server.bean.Product;
import org.springframework.stereotype.Service;

/**
 * 商品服务接口
 * @author LinYin
 * @date 2019-07-28 15:44
 */

@Service
public interface ProductService {
	/**
	 * 获取所有商品
	 * @return 所有商品组成的数组
	 */
	PageInfo findAll(int pageNum, int pageSize);

	/**
	 * 根据分页信息及查找条件返回数据
	 * @return 所有商品组成的数组
	 */
	PageInfo findAllByIdAndName(Integer pageNum, Integer pageSize, String productName, String productDesc);

	/**
	 * 添加商品
	 * @return 添加是否成功
	 */
	int addProduct(Product product);

	/**
	 * 更新商品
	 * @return 添加是否成功
	 */
	int updateProduct(Product product);

}
