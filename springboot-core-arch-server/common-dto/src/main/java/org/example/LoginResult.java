package org.example;


import lombok.Data;
import org.example.entity.Account;

@Data
public class LoginResult {
    private Account account;
    private String token;

    public LoginResult(Account account, String token) {
        this.account = account;
        this.token = token;
    }


}
