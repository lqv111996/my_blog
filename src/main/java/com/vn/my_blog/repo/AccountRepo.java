package com.vn.my_blog.repo;

import com.vn.my_blog.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepo extends JpaRepository<Account, Integer> {
    Optional<Account> findAccountById(Integer id);

    void deleteAccountById(Integer id);
}
