package com.abacus.overwork.work.service;

import com.abacus.overwork.work.dto.WorkRegInfo;
import com.abacus.overwork.work.entity.Work;
import com.abacus.overwork.work.repository.WorkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkService {

    private final WorkRepository workRepository;




    public WorkRegInfo retrieveWorkInfo(String userId, String workDate) {

//        Work work = workRepository.find





        return WorkRegInfo.builder()
                .userId("")
                .workDate("")
                .workStart("")
                .workEnd("")
                .lunchAmt("")
                .dinnerAmt("")
                .taxiAmt("")
                .build();
    }

}
