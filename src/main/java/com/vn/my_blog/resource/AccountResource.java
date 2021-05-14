package com.vn.my_blog.resource;

import com.vn.my_blog.model.Account;
import com.vn.my_blog.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountResource {
    private final AccountService accountService;

    @Autowired
    public AccountResource(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public ResponseEntity<List<Account>> listAccount() {
        List<Account> result = accountService.listAccount();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccount(@PathVariable("id") Integer id) {
        Account result = accountService.getAccount(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Account> addAccount(@RequestBody Account account) {
        Account result = accountService.addAccount(account);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @PutMapping("")
    public ResponseEntity<Account> updateAccount(@RequestBody Account account) {
        Account result = accountService.updateAccount(account);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAccount(@PathVariable Integer id) {
        accountService.deletePost(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
