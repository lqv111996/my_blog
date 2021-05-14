package com.vn.my_blog.service;

import com.vn.my_blog.exception.AccountNotFoundException;
import com.vn.my_blog.model.Account;
import com.vn.my_blog.repo.AccountRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private final AccountRepo accountRepo;

    public AccountService(AccountRepo postRepo) {
        this.accountRepo = postRepo;
    }

    public List<Account> listAccount() {
        return accountRepo.findAll();
    }

    public Account getAccount(Integer id) {
        return accountRepo.findAccountById(id).orElseThrow(() -> new AccountNotFoundException("Not found account id: " + id));
    }

    public Account addAccount(Account account) {
        return accountRepo.save(account);
    }

    public Account updateAccount(Account account) {
        return accountRepo.save(account);
    }

    public void deletePost(Integer id) {
        accountRepo.deleteAccountById(id);
    }
}
