package com.it.shu.service;

import com.it.shu.entity.DataVO;

import java.util.List;

public interface DataService {
    List<DataVO> queryData(String data_id);
}
