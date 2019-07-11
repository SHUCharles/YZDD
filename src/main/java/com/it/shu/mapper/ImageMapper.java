package com.it.shu.mapper;

import com.it.shu.entity.Image;
import com.it.shu.entity.ImageVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ImageMapper {
    //@Select("select * from image where user_id = #{user_id}")
    List <ImageVO> queryImage(String user_id);
}
