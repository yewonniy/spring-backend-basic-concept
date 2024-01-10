package com.yeye.review.repository;

import com.yeye.review.model.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity, Long> {

}
