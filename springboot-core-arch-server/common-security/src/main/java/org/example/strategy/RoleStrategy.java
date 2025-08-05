package org.example.strategy;


import org.example.LoginResult;
import org.example.entity.Account;

public interface RoleStrategy {

    String getRole();

    LoginResult login(Account account);

    void updatePassword(Account account);

    void register(Account account);

    Account selectById(String userId);
}

