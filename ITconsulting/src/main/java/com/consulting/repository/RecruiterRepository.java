package com.consulting.repository;

import com.consulting.entity.RecruiterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruiterRepository extends JpaRepository<RecruiterEntity,Long> {
}
