package org.example.serviceauth.strategy;


import lombok.extern.slf4j.Slf4j;
import org.example.LoginResult;
import org.example.common.enums.RoleEnum;
import org.example.entity.Account;
import org.example.serviceauth.service.AdminService;
import org.example.strategy.RoleStrategy;
import org.example.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class AdminStrategy implements RoleStrategy {

    @Autowired
    private AdminService adminService;

    @Override
    public String getRole() {
        return RoleEnum.ADMIN.getCode(); // "ADMIN"
    }

    @Override
    public LoginResult login(Account account) {
        Account admin = adminService.login(account);
        String token = JwtUtil.generateAccessToken(String.valueOf(admin.getId()), List.of(admin.getRole()));
        return new LoginResult(admin, token);
    }

    @Override
    public void updatePassword(Account account) {
        adminService.updatePassword(account);
    }

    @Override
    public void register(Account account) {
        log.info("管理员账号不支持自助注册，请从后台添加");
        throw new UnsupportedOperationException("管理员账号不支持自助注册，请从后台添加");
    }

    @Override
    public Account selectById(String userId) {
        return adminService.selectById(userId);
    }
}
