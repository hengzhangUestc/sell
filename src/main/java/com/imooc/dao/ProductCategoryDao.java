package com.imooc.dao;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ProductCategoryDao extends JpaRepository<ProductCategory,Integer > {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> CategoryTypeList);
}
