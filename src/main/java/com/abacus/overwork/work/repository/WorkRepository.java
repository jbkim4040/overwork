package com.abacus.overwork.work.repository;

import com.abacus.overwork.work.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkRepository extends JpaRepository<Work, String> {

    List<Work> findAllByDate(String date);

//    Work findAllByUserIdOrderByUser(String userId, String date);
}
