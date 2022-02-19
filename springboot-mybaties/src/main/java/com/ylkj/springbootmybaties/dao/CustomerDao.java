package com.ylkj.springbootmybaties.dao;

import com.ylkj.springbootmybaties.bean.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author : WR
 * @date:2022/2/9 13:42
 */
@Mapper
public interface  CustomerDao {
//    @Select("SELECT * FROM customer_info WHERE id = #{id}")
    public  Customer selectCustomerById(int id);
}
