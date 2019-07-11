package com.it.shu.controller;

import com.it.shu.entity.Data;
import com.it.shu.entity.DataVO;
import com.it.shu.entity.Image;
import com.it.shu.entity.ImageVO;
import com.it.shu.service.DataService;
import com.it.shu.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/image")
public class ImageController {
    @Autowired
    private ImageService imageService;
    @GetMapping("/list")
    public ModelAndView dataInfo(@RequestParam(value = "user_id",defaultValue = "10001") String user_id,
                                 Map<String,Object> map){
        List<ImageVO> images = imageService.queryImage(user_id);
        map.put("images",images);
        return new ModelAndView("image/list",map);
    }

    @Autowired
    private DataService dataService;
    @GetMapping("/detail")
    public ModelAndView detail(@RequestParam(value = "data_id",defaultValue = "1001") String data_id,
                               Map<String,Object> map){
        List<DataVO> detail = dataService.queryData(data_id);
        map.put("detail",detail);
        return  new ModelAndView("image/detail");
    }
}
