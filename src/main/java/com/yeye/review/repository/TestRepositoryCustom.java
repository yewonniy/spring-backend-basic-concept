package com.yeye.review.repository;

import com.yeye.review.model.TestEntity;

import java.util.List;

public interface TestRepositoryCustom {

    public List<TestEntity> findAllByNameByQueryDsl(String name);
}
