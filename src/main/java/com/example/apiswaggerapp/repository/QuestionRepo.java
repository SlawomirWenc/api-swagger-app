package com.example.apiswaggerapp.repository;

import com.example.apiswaggerapp.entity.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepo extends CrudRepository<Question, Long> {

    Question getQuestionById(Long id);
}
