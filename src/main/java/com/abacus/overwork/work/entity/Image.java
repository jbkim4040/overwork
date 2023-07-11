package com.abacus.overwork.work.entity;

import com.abacus.overwork.common.audit.Audit;
import jakarta.persistence.*;

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

    @OneToOne(mappedBy = "image")
    private Work work;
}
