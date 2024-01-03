package com.example;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class DatabaseChecker {

    @PersistenceContext
    private EntityManager entityManager;

    public void checkDatabaseConnection() {
        try {
            entityManager.createNativeQuery("SELECT 1").getSingleResult();
            System.out.println("Connection to the database established successfully.");
        } catch (Exception e) {
            System.err.println("Failed to connect to the database: " + e.getMessage());
        }
    }
}
