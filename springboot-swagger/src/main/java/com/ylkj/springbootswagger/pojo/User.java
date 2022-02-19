package com.ylkj.springbootswagger.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author : WR
 * @date:2022/2/16 14:50
 */
@ApiModel(description = "用户对象")
public class User {

    @ApiModelProperty(value = "用户昵称", required = true)
    public String username;
    @ApiModelProperty(value = "用户密码", required = true)
    public String password;
}
