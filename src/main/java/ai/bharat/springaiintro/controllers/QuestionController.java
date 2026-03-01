package ai.bharat.springaiintro.controllers;

import ai.bharat.springaiintro.model.Answer;
import ai.bharat.springaiintro.model.Question;
import ai.bharat.springaiintro.services.OpenAIService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    private final OpenAIService openAIService;

    public QuestionController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping
    public Answer askQuestion(Question question) {
        return openAIService.getAnswer(question);
    }
}
