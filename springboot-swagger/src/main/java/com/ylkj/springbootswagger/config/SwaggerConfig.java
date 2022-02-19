package com.ylkj.springbootswagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author : WR
 * @date:2022/2/16 12:05
 */
@Configuration
@EnableSwagger2   //开启swagger2        测试运行：http://localhost:8080/swagger-ui.html
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //RequestHandlerSelectors，配置要扫描接口的方式
                //basePackage 扫描该路径下的所有包
                //any() 扫描全部
                // none() 都不扫描
                // withClassAnnotation 扫描类上的注解  参数是一个注解的反射对象
                // withClassAnnotation 扫描方法上的注解
                .apis(RequestHandlerSelectors.basePackage("com.ylkj.springbootswagger"))
                //.paths() 过滤什么路径
                .paths(PathSelectors.any())
                .build();

    }

    //配置swagger信息  apiInfo
    private ApiInfo apiInfo() {
        //作者信息
        Contact contact = new Contact("WR", "http://www.baidu.com", "1163704233@qq.com");
        return new ApiInfo(
                "swagger Api",
                "wr的swagger Api",
                "v1.0",
                "http://www.baidu.com",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());

    }
}
