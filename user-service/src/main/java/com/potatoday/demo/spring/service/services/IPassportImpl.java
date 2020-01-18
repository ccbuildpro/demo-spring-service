package com.potatoday.demo.spring.service.services;

import com.potatoday.demo.spring.api.IPassport;
import com.potatoday.demo.spring.api.request.RegisterRequest;
import com.potatoday.demo.spring.service.domain.user.UserDO;
import com.potatoday.demo.spring.service.mapper.passport.UserMapper;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class IPassportImpl implements IPassport {
    @Resource
    private UserMapper mapperUser;

    @Override
    public String register(@RequestBody RegisterRequest request) {
        if(StringUtils.isEmpty(request.getAccount())){
            return "账号不能为空";
        }
        if(StringUtils.isEmpty(request.getPassword())){
            return "密码不能为空";
        }
        if(request.getAccount().length()<5){
            return "账号长度不能小于5";
        }
        if(request.getPassword().length()<6){
            return "密码长度不能小于6";
        }
//        String sql="insert into user ";
        //1,校验输入参数：账号长度，密码长度，密码规范
        //2,校验账号是否已存在
        //3,生成账号，user id
        UserDO user=new UserDO();
        user.setAccount(request.getAccount());
        user.setPassword(request.getPassword());
        UserDO userExist= mapperUser.selectByAccount(request.getAccount());
        if(userExist!=null && userExist.getUid()!=null &&userExist.getUid()>0){
            return "用户已存在";
        }
       Integer result= mapperUser.insertSelective(user);
       if (result!=1){
           return "注册失败";
       }
        return "注册成功";
    }

    @Override
    public String login(RegisterRequest request) {
        if(StringUtils.isEmpty(request.getAccount())){
            return "账号不能为空";
        }
        if(StringUtils.isEmpty(request.getPassword())){
            return "密码不能为空";
        }
        UserDO userExist= mapperUser.selectByAccount(request.getAccount());
        if(userExist!=null && userExist.getUid()!=null &&userExist.getUid()>0){
            if(userExist.getPassword().equals(request.getPassword())){
                return "登录成功，uid是:"+userExist.getUid();
            }else{
                return "密码错误";
            }
        }else{
            return "账号不存在";
        }
    }

    @Override
    public Boolean getUserList(RegisterRequest request) {
        return null;
    }


}
