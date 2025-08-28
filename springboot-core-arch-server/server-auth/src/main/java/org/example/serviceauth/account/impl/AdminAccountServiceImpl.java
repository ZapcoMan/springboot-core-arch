package org.example.serviceauth.account.impl;


import jakarta.annotation.Resource;

import org.apache.catalina.User;
import org.example.common.enums.RoleEnum;
import org.example.core.service.impl.BaseServiceImpl;
import org.example.entity.Account;
import org.example.security.AccountService;
import org.example.serviceauth.mapper.AdminMapper;
import org.example.serviceauth.service.AdminService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 管理员账户服务实现类
 * 实现了AccountService接口，用于处理管理员账户相关的业务逻辑
 */
@Service
public class AdminAccountServiceImpl extends BaseServiceImpl<Account, String, AdminMapper> implements AccountService {



    @Resource
    private AdminService adminService;

    public AdminAccountServiceImpl(AdminMapper mapper) {
        super(mapper);
    }

    /**
     * 获取角色枚举值
     *
     * @return RoleEnum.ADMIN 管理员角色枚举
     */
    @Override
    public RoleEnum getRole() {
        return RoleEnum.ADMIN;
    }

    /**
     * 根据ID查询账户信息
     *
     * @param id 账户ID
     * @return Account 账户信息
     */
    @Override
    public Account selectById(Long id) {
        return null;
    }

    /**
     * 根据ID查询账户信息
     *
     * @param id 账户ID
     * @return Account 账户信息
     */
    @Override
    public Account selectById(String id) {
        return adminService.selectById(id);
    }

    /**
     * 查询所有账户信息
     *
     * @return List<Account> 账户信息列表
     */
    @Override
    public List<Account> selectAll() {
        return List.of();
    }

    /**
     * 根据ID更新账户信息
     *
     * @param id 账户ID
     */
    @Override
    public void updateById(Long id) {

    }

    /**
     * 插入账户信息
     *
     * @param account 账户信息
     */
    @Override
    public void insert(Account account) {

    }

    /**
     * 根据ID更新账户信息
     *
     * @param account 账户信息
     */
    @Override
    public void updateById(Account account) {

    }

    /**
     * 根据ID删除账户信息
     *
     * @param id 账户ID
     */
    @Override
    public void deleteById(String id) {

    }

    /**
     * 管理员登录验证
     *
     * @param account 包含用户名和密码的账户信息
     * @return Account 登录成功的账户信息
     */
    @Override
    public Account login(Account account) {
        return adminService.login(account);
    }

    /**
     * 管理员注册
     *
     * @param user 用户信息
     */
    @Override
    public void register(User user) {
    }

    /**
     * 更新管理员密码
     *
     * @param account 包含新密码信息的账户对象
     */
    @Override
    public void updatePassword(Account account) {
        adminService.updatePassword(account);
    }
}
