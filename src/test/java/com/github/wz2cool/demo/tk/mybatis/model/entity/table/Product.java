package com.github.wz2cool.demo.tk.mybatis.model.entity.table;

import java.math.BigDecimal;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Frank
 * \* Date: 8/4/2017
 * \* Time: 2:03 PM
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Product {
    private Integer productID;
    private String productName;
    private BigDecimal price;
    private Integer categoryID;

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }
}