package com.it.shu.service.impl;

import com.it.shu.entity.Image;
import com.it.shu.entity.ImageVO;
import com.it.shu.mapper.ImageMapper;
import com.it.shu.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageMapper imageMapper;
    @Override
    public List<ImageVO> queryImage(String user_id) {
        List<ImageVO> images = imageMapper.queryImage(user_id);
        return images;
    }
}
