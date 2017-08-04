package com.github.wz2cool.demo.tk.mybatis.model.test;

import com.github.wz2cool.demo.tk.mybatis.TestApplication;
import com.github.wz2cool.demo.tk.mybatis.mapper.CategoryDao;
import com.github.wz2cool.demo.tk.mybatis.model.entity.table.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Frank
 * \* Date: 8/4/2017
 * \* Time: 2:32 PM
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = TestApplication.class)
public class SimpleTkMapperTest {

    @Autowired
    private CategoryDao categoryDao;

    @Test
    public void selectAllTest() {
        List<Category> categories = categoryDao.selectAll();
        assertEquals(true, categories.size() > 0);
    }

    @Test
    public void insertTest() {
        Category newCategory = new Category();
        newCategory.setCategoryID(1000);
        newCategory.setCategoryName("test");
        newCategory.setDescription("for test");
        int result = categoryDao.insert(newCategory);
        assertEquals(1, result);
    }
}