package com.tale.dao;

import com.tale.model.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface UsersDao extends BaseDao<Users> {

}