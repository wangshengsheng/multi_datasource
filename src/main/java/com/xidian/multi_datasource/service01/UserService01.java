package com.xidian.multi_datasource.service01;

import com.xidian.multi_datasource.mapper01.UserMapper01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService01 {

    @Autowired
    private UserMapper01 userMapper01;


    /**
     * DataSource1Config文件中的部分代码，下面transactionManager的值和@Bean(name的值相同
     * @Bean(name = "test1TransactionManager")
     * public DataSourceTransactionManager testTransactionManager(@Qualifier("test1DataSource") DataSource dataSource) {
     * return new DataSourceTransactionManager(dataSource);
     * }
     */
    @Transactional(transactionManager = "test1TransactionManager")
    public int insert(String name, Integer age) {
        int i = userMapper01.insert(name, age);

        int j = 1 / age;
        return i;
    }
}
