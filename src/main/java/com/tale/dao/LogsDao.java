package com.tale.dao;

import com.tale.model.entity.Logs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by hpxl on 4/3/18.
 */
@Mapper
public interface LogsDao extends BaseDao<Logs> {

}
