package com.consulting.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public class BaseEntity {
    @Column(name = "id", nullable = false, updatable = false, insertable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column(name = "created", nullable = false, updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createdDate;
    @Column(name = "created_by", updatable = true)
    @CreatedBy
    private String createdBy;
    @Column(name = "updated")
    @UpdateTimestamp
    private Date updatedDate;
    @Column(name = "updated_by", updatable = true)
    @LastModifiedBy
    private String updatedBy;

}
