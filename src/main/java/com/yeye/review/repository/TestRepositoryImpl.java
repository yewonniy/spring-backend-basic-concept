package com.yeye.review.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.yeye.review.model.QTestEntity;
import com.yeye.review.model.TestEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class TestRepositoryImpl implements TestRepositoryCustom{

    private final JPAQueryFactory queryFactory;

    @Override
    public List<TestEntity> findAllByNameByQueryDsl(String name) {
        return queryFactory.selectFrom(QTestEntity.testEntity)
                .fetch();
    }
}
