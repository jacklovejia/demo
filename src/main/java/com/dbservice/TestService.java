package com.dbservice;

import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;

public interface TestService {

    List<Map<String, String>> getList();

    JSONObject getListPage(int currentPage, int pageSize);

}
