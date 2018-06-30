package com.tale.dao;

import com.tale.dto.MetaDto;
import com.tale.model.entity.Metas;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by hpxl on 4/3/18.
 */
@Mapper
public interface MetasDao extends BaseDao<Metas> {

    public List<MetaDto> selectFromSql(Map<String, Object> map);

    Integer countWithSql(Integer mid);

    public MetaDto selectDtoByNameAndType(Map<String, Object> map);
}
