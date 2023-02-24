package com.example.test_login.repository;

import com.example.test_login.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJdbcTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserReposotoryTests {
//    @Autowired
//    private UserRepository repo;
//
//    @Autowired
//    private TestEntityManager entityManager;
//
//    // test methods go below
//    @Test
//    public void testCreateUser() {
//        User user = new User();
//        user.setEmail("ravikumar@gmail.com");
//        user.setPassword("ravi2020");
//        user.setFirstName("Ravi");
//        user.setLastName("Kumar");
//
//        User savedUser = repo.save(user);
//
//        User existUser = entityManager.find(User.class, savedUser.getId());
//
//        assertThat(user.getEmail()).isEqualTo(existUser.getEmail());
//
//    }
}
