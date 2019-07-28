package com.vstore.vstore_server.controller;

import com.github.pagehelper.PageInfo;
import com.vstore.vstore_server.bean.Product;
import com.vstore.vstore_server.bean.Product1;
import com.vstore.vstore_server.service.serviceinter.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 商品控制类
 * @author LinYin
 * @date 2019-07-28 14:51
 */
@RestController
@RequestMapping("/manage/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	private final static String NULL_VALUE = "NullValue";


	/**
	 * 根据分页信息返回数据
	 * @param pageNum 分页信息
	 * @param pageSize 分页信息
	 * @return 商品列表
	 */
	@RequestMapping(path = "/list",method = RequestMethod.GET)
	public Map<String,Object> findAll(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
		PageInfo pageInfo = productService.findAll(pageNum, pageSize);

		// 返回设置
		Map<String,Object> map=new HashMap<>();
		map.put("status", pageInfo == null ? 1 : 0);
		map.put("data", pageInfo);
		return map;
	}

	/**
	 * 根据分页信息及查找条件返回数据
	 * @param pageNum 分页信息
	 * @param pageSize 分页信息
	 * @param productDesc 商品描述 可选参数
	 * @param productName 商品名字 可选参数
	 * @return 商品列表
	 */
	@RequestMapping(path = "/search",method = RequestMethod.GET)
	public Map<String,Object> findAllByIdAndName(@RequestParam Integer pageNum, @RequestParam Integer pageSize,
	                                             @RequestParam(defaultValue = NULL_VALUE) String productName,
	                                             @RequestParam(defaultValue = NULL_VALUE) String productDesc){
		PageInfo pageInfo = productService.findAllByIdAndName(pageNum, pageSize, productName, productDesc);

		// 返回设置
		Map<String,Object> map=new HashMap<>();
		map.put("status", pageInfo == null ? 1 : 0);
		map.put("data", pageInfo);
		return map;
	}

	/**
	 * 新增商品
	 * @param p 商品信息
	 * @return 商品列表
	 */
	@RequestMapping(path = "/add",method = RequestMethod.POST)
	public Map<String, Object> addProduct(@RequestBody Product1 p){

		Map<String, Object> map = new HashMap<>();

		Product product = new Product(p);
		product.setId((UUID.randomUUID()+"").substring(0,20));

		int addFlag = productService.addProduct(product);

		if(addFlag == 1) {
			map.put("status", 0);
			map.put("data", product);
			map.put("add", addFlag);
		}else{
			map.put("status", 1);
			map.put("msg", "添加出错");
		}
		return map;
	}

	/**
	 * 更新商品
	 * @param p 商品信息
	 * @return 状态
	 */
	@RequestMapping(path = "/update",method = RequestMethod.POST)
	public Map<String, Object> updateProduct(@RequestBody Product1 p){

		Map<String, Object> map = new HashMap<>();

		Product product = new Product(p);
		int updateFlag = productService.updateProduct(product);

		if(updateFlag == 1) {
			map.put("status", 0);
		}else{
			map.put("status", 1);
		}
		return map;
	}

	/**
	 * 更新商品状态
	 * @param reqMap 商品信息
	 * @return 状态
	 */
	@RequestMapping(path = "/updateStatus",method = RequestMethod.POST)
	public Map<String, Object> updateProductStatus(@RequestBody Map<String,Object> reqMap){
		Map<String, Object> map = new HashMap<>();

		Product product = new Product();
		product.setId((String) reqMap.get("productId"));
		product.setStatus((Integer) reqMap.get("status"));

		int updateFlag = productService.updateProduct(product);

		if(updateFlag == 1) {
			map.put("status", 0);
		}else{
			map.put("status", 1);
		}
		return map;
	}
}
