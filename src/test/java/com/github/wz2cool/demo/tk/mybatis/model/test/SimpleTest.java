package com.github.wz2cool.demo.tk.mybatis.model.test;

import com.github.wz2cool.demo.tk.mybatis.TestApplication;
import com.github.wz2cool.demo.tk.mybatis.mapper.ProductDao;
import com.github.wz2cool.demo.tk.mybatis.model.entity.table.Product;
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
 * \* Time: 2:25 PM
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = TestApplication.class)
public class SimpleTest {

    @Autowired
    private ProductDao productDao;

    @Test
    public void testSelect() throws Exception {
        List<Product> productList = productDao.getProducts();
        assertEquals(true, productList.size() > 0);
    }
}