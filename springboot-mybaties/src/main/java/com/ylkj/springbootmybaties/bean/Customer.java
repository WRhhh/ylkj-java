package com.ylkj.springbootmybaties.bean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 * @author : WR
 * @date:2022/2/9 13:39
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private int id;
    private String cname;
    private String sex;
    private String telephone;
    private String address;
    private String birthday;
}
