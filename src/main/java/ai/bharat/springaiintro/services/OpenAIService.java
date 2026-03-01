package ai.bharat.springaiintro.services;

import ai.bharat.springaiintro.model.Answer;
import ai.bharat.springaiintro.model.GetCapitalRequest;
import ai.bharat.springaiintro.model.Question;

public interface OpenAIService {

    String getAnswer(String question);

    Answer getAnswer(Question question);

    Answer getCapital(GetCapitalRequest getCapitalRequest);

    Answer getCapitalWithInfo(GetCapitalRequest getCapitalRequest);
}
