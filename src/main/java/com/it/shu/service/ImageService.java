package com.it.shu.service;

import com.it.shu.entity.ImageVO;

import java.util.List;

public interface ImageService {
    List<ImageVO> queryImage(String user_id);
}
