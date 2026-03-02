package ai.bharat.springaiintro.controllers;

import ai.bharat.springaiintro.model.Answer;
import ai.bharat.springaiintro.model.GetCapitalRequest;
import ai.bharat.springaiintro.model.GetCapitalResponse;
import ai.bharat.springaiintro.model.Question;
import ai.bharat.springaiintro.services.OpenAIService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    private final OpenAIService openAIService;

    public QuestionController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @GetMapping("/ask")
    public Answer askQuestion(@RequestBody Question question) {
        return openAIService.getAnswer(question);
    }

    @GetMapping("/capital")
    public GetCapitalResponse getCapital(@RequestBody GetCapitalRequest getCapitalRequest) {
        return openAIService.getCapital(getCapitalRequest);
    }

    @GetMapping("/capitalWithInfo")
    public Answer getCapitalWithInfo(@RequestBody GetCapitalRequest getCapitalRequest) {
        return openAIService.getCapitalWithInfo(getCapitalRequest);
    }
}
