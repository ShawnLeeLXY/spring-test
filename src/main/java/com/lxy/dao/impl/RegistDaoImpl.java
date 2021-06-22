package com.lxy.dao.impl;

import com.lxy.dao.RegistDao;
import com.lxy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Repository
public class RegistDaoImpl implements RegistDao {

    @Autowired
    private DataSource dataSource;

    @Override
    public void register(User user) {
        try {
            System.out.println("注册功能Dao层方法开始执行...");
            Connection connection = dataSource.getConnection();
            System.out.println(connection);
            System.out.println("Dao层方法执行完毕");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
