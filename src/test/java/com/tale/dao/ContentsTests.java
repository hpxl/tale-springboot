package com.tale.dao;

import com.tale.dto.Types;
import com.tale.model.entity.Contents;
import com.tale.model.entity.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hpxl on 20/6/18.
 */
@MapperScan("com.tale.dao")
@RunWith(SpringRunner.class)
@SpringBootTest
public class ContentsTests {
    @Autowired
    private UsersDao usersDao;

    @Resource
    private ContentsDao contentsDao;

    @Test
    public void test() {
        int p = 1;
        int limit = 12;
        int offset = (p > 1) ? (p - 1) * limit : 0;

        Map<String, Object> map = new HashMap<>();
        map.put("offset", offset);
        map.put("limit", limit);

        map.put("order", "created desc");
        map.put("type", Types.ARTICLE);
        map.put("status", Types.PUBLISH);
        List<Contents> data = contentsDao.queryList(map);
        System.out.println(data);
    }
}
