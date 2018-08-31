package com.mystudy.springboot.dao;

import com.mystudy.springboot.mapper.WhitelistAccountMapper;
import com.mystudy.springboot.model.WhitelistAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Auther: GJB
 * @Date: 2018/8/31 20:08
 * @Description:
 */
@Repository
public class WhitelistAccountDao {

    @Autowired
    private WhitelistAccountMapper whitelistAccountMapper;

    public WhitelistAccount selectWhitelistAccountById(Integer id){
        return whitelistAccountMapper.selectByPrimaryKey(id);
    }

}
