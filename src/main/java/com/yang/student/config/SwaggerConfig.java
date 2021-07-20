package com.yang.student.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Miracle Yang～ on 2021/7/19 10:35 上午
 */
@EnableSwagger2
@Configurable
public class SwaggerConfig {
    @Bean
    public Docket createResApit(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yang.student.mybatisPlus.controller"))
                .paths(PathSelectors.any()).build();
    }
    /**
     * 获取swagger创建初始化信息
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("yang")
                .contact(new Contact("yang","1","1"))
                .version("1.0")
                .description("系统描述")
                .build();
    }

}
