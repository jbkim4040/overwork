package com.abacus.overwork.user.controller;

import com.abacus.overwork.common.util.PasswordEncryptor;
import com.abacus.overwork.user.dto.Rank;
import com.abacus.overwork.user.dto.Role;
import com.abacus.overwork.user.entity.User;
import com.abacus.overwork.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @PostMapping("/signup")
    public void signUp(@RequestParam String id, @RequestParam String name, @RequestParam String phone, @RequestParam String account,
                       @RequestParam String bank, @RequestParam String email, @RequestParam String password) {


        User user = User.builder()
                .id(id)
                .name(name)
                .phone(phone)
                .account(account)
                .bank(bank)
                .email(email)
                .password(PasswordEncryptor.Scrypt(password))
                .key(UUID.randomUUID().toString().replaceAll("-", ""))
                .role(Role.ROLE_BASIC)
                .rank(Rank.Assistant)
                .build();

        userService.signUp(user);
    }


    @PostMapping("login")
    public void login(@RequestParam String id, @RequestParam String password) {

        System.out.println(userService.login(id, password) ? "로그인 성공" : "로그인실패");
    }
}