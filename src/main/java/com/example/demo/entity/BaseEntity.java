package com.example.demo.entity;

import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter

public class BaseEntity {
    @CreationTimestamp //생성되었을때의 시간정보
    @Column(updatable = false)
    private LocalDateTime createdTime;

    @UpdateTimestamp //업데이트되었을때의 시간정보
    @Column(insertable = false)
    private LocalDateTime updatedTime;
}
