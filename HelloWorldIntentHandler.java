package com.ithub.AlexaSayShalomHandlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class HelloWorldIntentHandler implements RequestHandler {

//    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("HelloWorldIntent"));
    }

//    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Shalom world";
       return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("HelloWorld", speechText)
                .build();
    }

}
