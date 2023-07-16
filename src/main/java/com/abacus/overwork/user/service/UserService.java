package com.abacus.overwork.user.service;

import com.abacus.overwork.common.util.PasswordEncryptor;
import com.abacus.overwork.user.entity.User;
import com.abacus.overwork.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void signUp(User user) {
        userRepository.save(user);
    }

    @Transactional()
    public boolean login(String id, String password) {
        User user = userRepository.findById(id).get();

        if(!StringUtils.isEmpty(user.getId())) {
            password = PasswordEncryptor.Scrypt(password);

            if(user.getPassword().equals(password)) return true;
        }
        return false;
    }
}
