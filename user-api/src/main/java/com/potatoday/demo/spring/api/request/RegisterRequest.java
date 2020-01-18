package com.potatoday.demo.spring.api.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 注册服务的请求体
 * @author raistlin
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel( value = "注册的请求体")
public class RegisterRequest {
    /**
     * 账号
     */
    @ApiModelProperty(value = "账号")
    private String account;
    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;
}
