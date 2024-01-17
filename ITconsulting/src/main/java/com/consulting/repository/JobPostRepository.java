package com.consulting.repository;

import com.consulting.entity.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPostRepository extends JpaRepository<JobPost,Long> {
}
