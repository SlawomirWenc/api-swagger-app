package com.example.apiswaggerapp;


import com.example.apiswaggerapp.QuestionRepo;
import com.example.apiswaggerapp.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class QuestionController {

    private QuestionRepo questionRepo;

    @Autowired
    public QuestionController(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    public Iterable<Question> getAllQuestions(){
        return questionRepo.findAll();
    }

    public Question getQuestionById(Long id){
        return questionRepo.getQuestionById(id);
    }

    public Boolean saveQuestion(Question question){
        questionRepo.save(question);
        return true;
    }

    public Boolean deleteQuestionById(Long id){
        questionRepo.deleteById(id);
        return true;
    }
}
