package org.example.serviceauth.controller;


import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.example.common.annotation.AuditLogRecord;
import org.example.common.enums.RoleEnum;
import org.example.core.controller.BaseController;

import org.example.core.service.BaseService;
import org.example.entity.Account;
import org.example.result.R;
import org.example.security.RoleStrategyContext;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/web")
public class WebController extends BaseController<Account, String> {

    @Resource
    private RoleStrategyContext roleStrategyContext;

    protected WebController(@Qualifier("adminAccountServiceImpl") BaseService<Account, String> baseService) {
        super(baseService);
    }

    @GetMapping("/hello")
    public R<Object> hello() {
        return R.ok().message("hello");
    }

    @Operation(summary = "用户注册")
    @AuditLogRecord(action = "用户注册", resource = "用户")
    @PostMapping("/register")
    public R<Void> register(@RequestBody Account account) {
        String role = account.getRole();
        if (!RoleEnum.USER.getCode().equals(role)) {
            return R.error("仅允许学生注册，教师与管理员请联系教务处添加账号");
        }

        try {
            roleStrategyContext.getStrategy(role).register(account);
        } catch (UnsupportedOperationException e) {
            log.warn("注册策略未实现：{}", e.getMessage());
        }

        return R.ok();
    }

    @Operation(summary = "更新密码")
    @AuditLogRecord(action = "更新密码", resource = "用户")
    @PostMapping("/updatePassword")
    public R<Void> updatePassword(@RequestBody Account account) {
        roleStrategyContext.getStrategy(account.getRole()).updatePassword(account);
        return R.ok();
    }
}
