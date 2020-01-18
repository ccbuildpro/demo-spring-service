package com.potatoday.demo.spring.service.mapper.passport;

import com.potatoday.demo.spring.service.domain.user.UserDO;

public interface UserMapper {
    UserDO selectByPrimaryKey(Long uid);
    UserDO selectByAccount(String account);
    Integer deleteById(Long uid);
    Integer updateByPrimaryKey(UserDO userDO);
    Integer  updateByPrimaryKeySelective(UserDO userDO);
    Integer insertSelective(UserDO userDO);
}
