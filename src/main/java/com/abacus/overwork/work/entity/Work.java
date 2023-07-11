package com.abacus.overwork.work.entity;

import com.abacus.overwork.common.audit.Audit;
import com.abacus.overwork.user.entity.User;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "tb_work_m")
public class Work extends Audit {

    @Id
    @GeneratedValue
    @Column(name = "WORK_ID", nullable = false, length = 32)
    private String id;

    @Column(name = "WORK_DATE", nullable = false, length = 8)
    private String date;

    @Column(name = "WORK_START", nullable = false, length = 8)
    private String start;

    @Column(name = "WORK_FINISH", nullable = false, length = 8)
    private String finish;

    @Column(name = "WORK_LUNCH_YN", length = 1)
    @ColumnDefault(value = "N")
    private String lunchYn;

    @Column(name = "WORK_DINNER_YN", length = 1)
    @ColumnDefault(value = "N")
    private String dinnerYn;

    @Column(name = "WORK_TAXI_YN", length = 1)
    @ColumnDefault(value = "N")
    private String taxiYn;

    @Column(name = "WORK_TAXI_FEE", length = 6)
    @ColumnDefault(value = "0")
    private String taxiFee;

    @OneToOne
    @JoinColumn(name = "IMAGE_ID")
    private Image image;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;
}
