package com.pos.pos.test.service;

import com.pos.pos.test.dao.TestDao;
import com.pos.pos.test.domain.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    TestDao testDao;

    public Menu getMenu() throws Exception{
        return testDao.getMenu();
    }
}
