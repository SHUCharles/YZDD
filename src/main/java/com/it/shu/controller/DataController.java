package com.it.shu.controller;

import com.it.shu.entity.DataVO;
import com.it.shu.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/data")
public class DataController {
    @Autowired
    private DataService dataService;
    @GetMapping("/list")
   public ModelAndView dataInfo(@RequestParam(value = "data_id",defaultValue = "1001") String data_id,
                                 Map<String,Object> map){
        List<DataVO> datalist = dataService.queryData(data_id);
        DataVO dataVO = datalist.get(0);
        map.put("data",dataVO);
        return new ModelAndView("data/list",map);
    }
}
