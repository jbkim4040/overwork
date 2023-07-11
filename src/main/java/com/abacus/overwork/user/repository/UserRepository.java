package com.abacus.overwork.user.repository;

import com.abacus.overwork.user.entity.User;

public interface UserRepository {
    User findById(String id);
}
