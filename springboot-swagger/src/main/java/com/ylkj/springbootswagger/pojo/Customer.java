package com.ylkj.springbootswagger.pojo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author : WR
 * @date:2022/2/16 14:50
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "用户对象")
public class Customer {

    @ApiModelProperty(value = "ID", required = true)
    private int id;
    @ApiModelProperty(value = "用户昵称")
    private String cname;
    @ApiModelProperty(value = "性别")
    private String sex;
    @ApiModelProperty(value = "电话号码")
    private String telephone;
    @ApiModelProperty(value = "用户地址")
    private String address;
    @ApiModelProperty(value = "生日")
    private String birthday;
}
