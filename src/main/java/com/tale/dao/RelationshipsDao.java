package com.tale.dao;

import com.tale.model.entity.Relationships;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by hpxl on 4/3/18.
 */
@Mapper
public interface RelationshipsDao extends BaseDao<Relationships> {

}
