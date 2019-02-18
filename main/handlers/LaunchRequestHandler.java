package handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.requestType;

public class LaunchRequestHandler implements RequestHandler {

//    @Override
	public boolean canHandle(HandlerInput input) {
		return input.matches(requestType(LaunchRequest.class));
	}

//    @Override
//	Test
	public Optional<Response> handle(HandlerInput input) {
		String speechText = "Welcome to the Alexa Candles";
		return input.getResponseBuilder().withSpeech(speechText).withSimpleCard("Welcome", speechText)
				.withReprompt(speechText).build();
	}

}
