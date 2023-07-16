package com.abacus.overwork.work.dto;

import lombok.Builder;

/**
 * packageName    : com.abacus.overwork.work.dto
 * fileName       : workRegInfo
 * author         : jbkim
 * date           : 2023-07-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-07-15        jbkim       최초 생성
 */
@Builder
public class WorkRegInfo {

    private String userId;

    private String workDate;

    private String workStart;

    private String workEnd;

    private String lunchAmt;

    private String dinnerAmt;

    private String taxiAmt;
}
