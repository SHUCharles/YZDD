package com.it.shu.mapper;

import com.it.shu.entity.DataVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DataMapper {
      List<DataVO> queryData(String data_id);
}
