package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        DatabaseChecker databaseChecker = context.getBean(DatabaseChecker.class);
        databaseChecker.checkDatabaseConnection();

        context.close();
    }
}