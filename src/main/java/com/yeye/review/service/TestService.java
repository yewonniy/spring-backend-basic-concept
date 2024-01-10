package com.yeye.review.service;


import com.yeye.review.model.TestEntity;
import com.yeye.review.repository.TestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class TestService {
    private final TestRepository testRepository;

    public void create(String name, Integer age) {
        TestEntity testEntity = new TestEntity(name, age);
        testRepository.save(testEntity);
    }

    public void update(Long id, String name, Integer age) {
        TestEntity testEntity = testRepository.findById(id).orElseThrow();
        testEntity.changeNameAndAge(name, age);
        testRepository.save(testEntity);
    }

    public void delete(Long id) {
        TestEntity testEntity = testRepository.findById(id).get();
        testRepository.delete(testEntity);
    }
}
