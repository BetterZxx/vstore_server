package com.vstore.vstore_server.mapper;

import com.vstore.vstore_server.bean.Product;
import com.vstore.vstore_server.bean.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author LinYin
 * @date 2019-07-28 14:51
 * 逆向工程自动生成的mapper
 */
public interface ProductMapper {
    int countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}