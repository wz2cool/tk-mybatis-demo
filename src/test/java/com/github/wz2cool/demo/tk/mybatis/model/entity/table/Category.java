package com.github.wz2cool.demo.tk.mybatis.model.entity.table;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Frank
 * \* Date: 8/4/2017
 * \* Time: 2:30 PM
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Table(name = "category")
public class Category {
    @Id
    @Column(name = "category_id", table = "category")
    private Integer categoryID;
    private String categoryName;
    private String description;

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}