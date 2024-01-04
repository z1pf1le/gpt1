package com.example;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
@Transactional
public class UserService {
    @PersistenceContext
    private EntityManager entityManager;

//    public void addUser(User user) {
//        entityManager.persist(user);
//    }
    @Transactional
    public void addUser(User user) {
//        int x =
//        entityManager.createNativeQuery("SELECT * FROM users").getFirstResult();
//        System.out.println(x);

        String nativeQuery = "INSERT INTO users (id, username, email) VALUES (?, ?, ?)";

        entityManager.createNativeQuery(nativeQuery)
                .setParameter(1, user.getId())
                .setParameter(2, user.getName())
                .setParameter(3, user.getLastName())
                .executeUpdate();
    }
}
