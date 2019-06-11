package com.imooc.service;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CategoryServiceImpTest {

    @Autowired
    private CategoryServiceImp serviceImp;
    @Test
    public void findOne() {

        ProductCategory productCategory = serviceImp.findOne(1);
        Assert.assertNotEquals( 0, java.util.Optional.ofNullable(productCategory.getCategoryId()));

    }

    @Test
    public void findAll() {
        List<ProductCategory> list = serviceImp.findAll();
        Assert.assertNotEquals(3,list.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        List<ProductCategory> result =serviceImp.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("男生专享", 300);
        ProductCategory result =serviceImp.save(productCategory);
        Assert.assertNotNull(result);

    }
}