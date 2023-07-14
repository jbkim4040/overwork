package com.abacus.overwork.work.entity;

import com.abacus.overwork.common.audit.Audit;
import com.abacus.overwork.user.entity.User;

import javax.persistence.*;

@Entity
@Table(name = "tb_image_m")
public class Image extends Audit {

    @Id
    @Column(name = "IMAGE_ID", nullable = false, length = 32)
    private String id;

    @Column(name = "IMAGE_NAME", nullable = false, length = 50)
    private String name;

    @Column(name = "IMAGE_EXT", nullable = false, length = 10)
    private String extension;

    // 암호화 필요
    @Column(name = "IMAGE_PATH", nullable = false, length = 10)
    private String path;

    @Column(name = "IMAGE_UPLOAD_DTTM", nullable = false, length = 8)
    private String uploadDttm;

    @Column(name = "IMAGE_DELETE_YN", nullable = false, length = 1)
    private String deleteYn;

    @OneToOne(mappedBy = "image")
    private Work work;
}
