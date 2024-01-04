package com.example;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class Display {
    @PersistenceContext
    private EntityManager entityManager;
    public void displayUserRecords() {
        entityManager.createQuery("SELECT u FROM User u", User.class)
                .getResultList()
                .forEach(user -> System.out.println(user.getName() + " - " + user.getName()));
    }

}
