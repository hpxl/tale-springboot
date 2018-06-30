package com.tale.dao;

import com.tale.model.entity.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hpxl on 18/6/18.
 */
@MapperScan("com.tale.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
//@Transactional(rollbackFor = TipException.class)
public class UsersDaoTests {
    @Autowired
    private UsersDao usersDao;

    @Test
    public void test() {
        Users users = usersDao.queryObject(1);
        System.out.println(users);
        System.out.println(users.getPassword());
    }
}
