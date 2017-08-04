package com.github.wz2cool.demo.tk.mybatis.mapper;

import com.github.wz2cool.demo.tk.mybatis.model.entity.table.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Frank
 * \* Date: 8/4/2017
 * \* Time: 2:12 PM
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Mapper
public interface ProductDao {
    List<Product> getProducts();
}