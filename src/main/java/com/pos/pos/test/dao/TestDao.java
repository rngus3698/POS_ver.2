package com.pos.pos.test.dao;

import com.pos.pos.test.domain.Menu;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    public Menu getMenu(){
        return sqlSessionTemplate.selectOne("getMenu");
    }
}
