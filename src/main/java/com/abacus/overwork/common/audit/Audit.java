package com.abacus.overwork.common.audit;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@EntityListeners({AuditListener.class})
public class Audit {
    @Getter
    @Setter
    @Column(name = "DATA_INPT_ID", nullable = false, updatable = false)
    protected String dataInptId;

    @Getter
    @Setter
    @Column(name = "DATA_INPT_DTTM", nullable = false, updatable = false)
    protected LocalDateTime dataInptDttm;

    @Getter
    @Setter
    @Column(name = "DATA_UPDT_ID", nullable = false)
    protected String dataUpdtId;

    @Getter
    @Setter
    @Column(name = "DATA_UPDT_DTTM", nullable = false)
    protected LocalDateTime dataUpdtDttm;
}
