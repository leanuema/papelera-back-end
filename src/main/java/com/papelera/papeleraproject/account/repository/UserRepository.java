package com.papelera.papeleraproject.account.repository;

import com.papelera.papeleraproject.account.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM USER u WHERE u.USER_NAME LIKE :userName", nativeQuery = true)
    User findUserByUserName(@Param("userName") String userName);
}
