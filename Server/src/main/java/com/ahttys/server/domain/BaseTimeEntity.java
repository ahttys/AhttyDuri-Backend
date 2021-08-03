package com.ahttys.server.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
@Getter
public class BaseTimeEntity {
    @CreatedDate
    @Column
    private LocalDateTime created_at;

    @LastModifiedDate
    @Column
    private LocalDateTime updated_at;
}
