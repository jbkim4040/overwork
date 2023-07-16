package com.abacus.overwork.user.entity;

import com.abacus.overwork.common.audit.Audit;
import com.abacus.overwork.user.dto.Rank;
import com.abacus.overwork.user.dto.Role;
import com.abacus.overwork.work.entity.Image;
import com.abacus.overwork.work.entity.Work;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_user_m")
public class User extends Audit {

    @Id
    @Column(name = "USER_ID", nullable = false, length = 60)
    private String id;

    @Column(name = "USER_NAME", nullable = false, length = 10)
    private String name;

    @Column(name = "USER_EMAIL", nullable = false, length = 30)
    private String email;

    @Column(name = "USER_ACCOUNT", nullable = false, length = 15)
    private String account;

    @Column(name = "USER_BANK", nullable = false)
    private String bank;

    @Column(name = "USER_PHONE", length = 15)
    private String phone;

    @Enumerated(EnumType.STRING)
    @Column(name = "USER_ROLE", nullable = false, length = 10)
    private Role role;

    @Enumerated(EnumType.STRING)
    @Column(name = "USER_RANK", nullable = false, length = 10)
    private Rank rank;

    @Column(name = "USER_PASSWORD", nullable = false, length = 100)
    private String password;

    @Column(name = "USER_KEY", nullable = false, length = 100)
    private String key;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Work> works;
}
