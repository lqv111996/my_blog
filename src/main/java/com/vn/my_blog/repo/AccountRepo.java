package com.vn.blog_project.repo;

import com.vn.blog_project.model.Account;
import com.vn.blog_project.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepo extends JpaRepository<Account, Integer> {
    Optional<Account> findAccountById(Integer id);

    void deleteAccountById(Integer id);
}
