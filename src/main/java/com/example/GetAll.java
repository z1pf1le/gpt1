package com.example;



import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class GetAll {

    @PersistenceContext
    private EntityManager entityManager;

    public void users() {
        try {
            entityManager.createNativeQuery("SELECT * FROM users").getFirstResult();
            System.out.println("Connection to the database established successfully.");
        } catch (Exception e) {
            System.err.println("Failed to connect to the database: " + e.getMessage());
        }
    }
}