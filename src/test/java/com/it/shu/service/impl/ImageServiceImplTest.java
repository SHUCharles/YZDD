package com.it.shu.service.impl;

import com.it.shu.entity.Image;
import com.it.shu.entity.ImageVO;
import com.it.shu.service.ImageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImageServiceImplTest {
    @Autowired
    private ImageService imageService;
    @Test
    public void queryImage() {
        List<ImageVO> images = imageService.queryImage("10001");
        int size = images.size();
        System.out.println("Size:"+size);
    }
}