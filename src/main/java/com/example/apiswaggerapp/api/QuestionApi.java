package com.example.apiswaggerapp.api;

import com.example.apiswaggerapp.controller.QuestionController;
import com.example.apiswaggerapp.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionApi {

    private QuestionController questionController;

    @Autowired
    public QuestionApi(QuestionController questionController) {
        this.questionController = questionController;
    }

    @GetMapping("/all")
    public Iterable<Question> getAllQuestions(){
        return questionController.getAllQuestions();
    }

    @GetMapping("/{id}")
    public Question getQuestionById(@PathVariable Long id){
        return questionController.getQuestionById(id);
    }

    @GetMapping("/{id}/question")
    public String getQuestion(@PathVariable Long id){
        return questionController.getQuestionById(id).getQuestion();
    }

    @GetMapping("/{id}/correctAnswer")
    public String getAnswer(@PathVariable Long id){
        return questionController.getQuestionById(id).getCorrectAnswer();
    }

    @GetMapping("/{id}/answers")
    public List<String> getAnswers(@PathVariable Long id){
        Question question = questionController.getQuestionById(id);
        String answer1 = question.getAnswer1();
        String answer2 = question.getAnswer2();
        String answer3 = question.getAnswer3();
        String answer4 = question.getAnswer4();
        List<String> answers = Arrays.asList(answer1, answer2, answer3, answer4);
        return answers;
    }

    @PostMapping("/delete")
    public Boolean deleteQuestion(@RequestParam Long id){
        questionController.deleteQuestionById(id);
        return true;
    }


}
