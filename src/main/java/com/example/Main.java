package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        DatabaseChecker databaseChecker = context.getBean(DatabaseChecker.class);
//        databaseChecker.checkDatabaseConnection();

        GetAll getAll = context.getBean(GetAll.class);
        getAll.users();



        context.close();


    }
}