package com.xidian.multi_datasource.service02;


import com.xidian.multi_datasource.mapper02.UserMapper02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService02 {

    @Autowired
    private UserMapper02 userMapper02;


    @Transactional(transactionManager = "test2TransactionManager")
    public int insert(String name, Integer age) {
        int i = userMapper02.insert(name, age);

        int j = 1 / age;
        return i;
    }
}
