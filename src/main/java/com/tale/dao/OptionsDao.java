package com.tale.dao;

import com.tale.model.entity.Options;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by hpxl on 1/5/18.
 */
@Mapper
public interface OptionsDao extends BaseDao<Options> {

}
