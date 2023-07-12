package com.abacus.overwork.user.repository;

import com.abacus.overwork.user.entity.User;
import com.abacus.overwork.work.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
