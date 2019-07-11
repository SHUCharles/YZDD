package com.it.shu.service.impl;

import com.it.shu.entity.Data;
import com.it.shu.entity.DataVO;
import com.it.shu.mapper.DataMapper;
import com.it.shu.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private DataMapper dataMapper;
    @Override
    public List<DataVO> queryData(String data_id) {
        List<DataVO> dataVo = dataMapper.queryData(data_id);
        return dataVo;
    }
}
