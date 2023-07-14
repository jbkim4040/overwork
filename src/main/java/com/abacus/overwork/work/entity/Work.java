package com.abacus.overwork.work.entity;

import com.abacus.overwork.common.audit.Audit;
import com.abacus.overwork.user.entity.User;

import javax.persistence.*;

@Entity
@Table(name = "tb_work_m")
public class Work extends Audit {

    @Id
    @Column(name = "WORK_ID", nullable = false, length = 32)
    private String id;

    @Column(name = "WORK_DATE", nullable = false, length = 8)
    private String date;

    @Column(name = "WORK_START", nullable = false, length = 8)
    private String start;

    @Column(name = "WORK_END", nullable = false, length = 8)
    private String end;

    @Column(name = "WORK_LUNCH_YN", length = 1)
    private String lunchYn;

    @Column(name = "WORK_DINNER_YN", length = 1)
    private String dinnerYn;

    @Column(name = "WORK_TAXI_Yn", length = 1)
    private String taxiYn;

    @Column(name = "WORK_TAXI_AMT", length = 6)
    private String taxiFee;

    @OneToOne
    @JoinColumn(name = "IMAGE_ID")
    private Image image;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;
}
