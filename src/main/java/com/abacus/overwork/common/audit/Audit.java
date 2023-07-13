package com.abacus.overwork.common.audit;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Audit {

    @CreatedDate
    @Column(name = "DATA_CREATED_DTTM", nullable = false, updatable = false)
    protected LocalDateTime dataCreatedDttm;

    @LastModifiedDate
    @Column(name = "DATA_UPDATED_DTTM", nullable = false)
    protected LocalDateTime dataUpdatedDttm;
}
