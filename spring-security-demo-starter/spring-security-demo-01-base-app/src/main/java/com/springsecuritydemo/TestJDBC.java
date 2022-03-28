package com.springsecuritydemo;


import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
    public static void main(String[] args){

        //String jdbcUrl="jdbc:mysql://localhost:3306/spring_security_demo_plaintext?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
       String jdbcUrl="jdbc:mysql://localhost:3306/spring_security_demo_bcrypt?useSSL=false";
        String user= "springstudent";
        String pass="Sath@9381@#9";

        try{
            System.out.println("Connecting to database: "+jdbcUrl);
            Connection myConn= DriverManager.getConnection(jdbcUrl, user, pass);
            System.out.println("Connection Successful!!!!!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}