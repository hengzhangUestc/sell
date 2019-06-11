package com.imooc.dao;


import com.imooc.dataobject.ProductCategory;
import org.hibernate.annotations.Proxy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductCategoryDaoTest {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = productCategoryDao.getOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public  void  saveTest () {
        ProductCategory productCategory = productCategoryDao.getOne(2);
        productCategory.setCategoryType(200);
        productCategoryDao.save(productCategory);
    }

    @Test
    public  void findByCategoryTypeInTest ( )  {

        List<Integer> list = Arrays.asList(1, 2, 3);
        List<ProductCategory> result =productCategoryDao.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());

    }
}