package com.example.apiswaggerapp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends CrudRepository<Question, Long> {

    public Question getQuestionById(Long id);
}
