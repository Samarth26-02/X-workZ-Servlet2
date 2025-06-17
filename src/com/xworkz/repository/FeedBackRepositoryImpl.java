package com.xworkz.repository;

import com.xworkz.dto.FeedBackDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FeedBackRepositoryImpl implements FeedBackRepository{
    @Override
    public void ratings(FeedBackDTO feedBackDTO) {
        System.out.println("save feedback data to data base..");

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/generaldb";
            String username="root";
            String password="Xworkzodc@123";
            Connection connection= DriverManager.getConnection(url,username,password);

            Statement statement=connection.createStatement();
            String sql="insert into feedback_form_db(0,'"+feedBackDTO.getName()+"','"+feedBackDTO.getEmail()+"','"+ feedBackDTO.getCity()+"','"+ feedBackDTO.getMessage()+"','"+feedBackDTO.getSubject()+"','"+feedBackDTO.getState()+"','"+feedBackDTO.getRating()+"','"+")";

            statement.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
