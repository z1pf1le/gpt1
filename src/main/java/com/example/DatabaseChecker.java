package com.example;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class DatabaseChecker {

    @PersistenceContext
    private EntityManager entityManager;

    public void checkDatabaseConnection() {
//        try {
////            entityManager.createNativeQuery("SELECT 1").getSingleResult();
////            entityManager.createNativeQuery("DROP TABLE users").executeUpdate();
//
//            entityManager.createNativeQuery("CREATE TABLE courses (name varchar(255))").executeUpdate();
//
//
////            String nativeQuery = "INSERT INTO test.users (age, lastName, name) VALUES (?, ?, ?)";
////
////            entityManager.createNativeQuery(nativeQuery)
////                    .setParameter(1, 1)
////                    .setParameter(2, "s")
////                    .setParameter(3, "7syh")
////                    .executeUpdate();
////            System.out.println("Connection to the database established successfully.");
//        } catch (Exception e) {
//            System.err.println("Failed to connect to the database!: " + e.getMessage());
//        }
//         entityManager.createQuery("SELECT 1").getSingleResult();
//        entityManager.createNativeQuery("DROP TABLE users").executeUpdate();
        List users = entityManager.createNativeQuery("SELECT * FROM test.users").getResultList();

        System.out.println(users);
        for (Object user : users)
        {
            System.out.println(user);
        }



    }
}
