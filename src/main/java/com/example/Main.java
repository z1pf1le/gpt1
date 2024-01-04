package com.example;

import com.example.dao.UserDaoJDBCImpl;
import com.example.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;
import java.util.List;



public class Main {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//
////        User user0 = new User("M", "F", (byte) 5);
//
        DatabaseChecker databaseChecker = context.getBean(DatabaseChecker.class);
//        System.out.println(databaseChecker.checkDatabaseConnection());
        databaseChecker.checkDatabaseConnection();
//
//        Display display = context.getBean(Display.class);
//        display.displayUserRecords();
//
////        GetAll getAll = context.getBean(GetAll.class);
////        getAll.users();
////
////        UserServiceImpl userService = context.getBean(UserServiceImpl.class); //эту ошибку копаю
////        userService.saveUser("x", "x", (byte) 1);
////
////        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
////        userDaoJDBC.saveUser("x", "x", (byte) 1) ;
//
//        context.close();
//    }
//@PersistenceContext
//private EntityManager entityManager;

//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Main main = context.getBean(Main.class);
////        main.displayUserRecords();
//        context.close();
//    }

//    public void displayUserRecords() {
//        entityManager.createQuery("SELECT u FROM User u", User.class)
//                .getResultList()
//                .forEach(user -> System.out.println(user.getName() + " - " + user.getName()));
//    }

//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
////        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Main main = context.getBean(Main.class);
//        main.displayUserRecords();
//        context.close();
//    }
//
//    public void displayUserRecords() {
//        entityManager.createQuery("SELECT u FROM User u", User.class)
//                .getResultList()
//                .forEach(user -> System.out.println(user.getName() + " - " + user.getLastName()));
    }
}
