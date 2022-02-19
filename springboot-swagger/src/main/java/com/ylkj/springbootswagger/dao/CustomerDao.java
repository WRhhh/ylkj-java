package com.ylkj.springbootswagger.dao;

import com.ylkj.springbootswagger.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author : WR
 * @date:2022/2/16 13:42
 */
@Mapper
public interface  CustomerDao {
//    @Select("SELECT * FROM customer_info WHERE id = #{id}")
    public  Customer selectCustomerById(int id);
}
