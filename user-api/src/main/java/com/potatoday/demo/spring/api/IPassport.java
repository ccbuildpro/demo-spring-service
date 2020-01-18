package com.potatoday.demo.spring.api;

import com.potatoday.demo.spring.api.request.RegisterRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Passport相关的Api
 * @author raistlin
 */
@RequestMapping("/passport")
@Api(tags = {"Passport相关的接口"})
public interface IPassport {

    @PostMapping(value = "/register")
    @ApiOperation(value = "用户注册")
    String register(@RequestBody RegisterRequest request);

    @PostMapping(value = "/login")
    @ApiOperation(value = "登录")
    String login(@RequestBody RegisterRequest request);


    @PostMapping(value = "/get_user")
    @ApiOperation(value = "查询用户列表")
    Boolean getUserList(@RequestBody RegisterRequest request);
}
