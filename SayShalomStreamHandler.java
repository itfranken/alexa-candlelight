package com.ithub.AWSLamdbaSayShalomStreamer;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;
import com.ithub.AlexaSayShalomHandlers.CancelandStopIntentHandler;
import com.ithub.AlexaSayShalomHandlers.FallbackIntentHandler;
import com.ithub.AlexaSayShalomHandlers.HelloWorldIntentHandler;
import com.ithub.AlexaSayShalomHandlers.HelpIntentHandler;
import com.ithub.AlexaSayShalomHandlers.LaunchRequestHandler;
import com.ithub.AlexaSayShalomHandlers.SessionEndedRequestHandler;

public class SayShalomStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new HelloWorldIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler(),
                        new FallbackIntentHandler())
                // Add your skill id below
                .withSkillId("amzn1.ask.skill.2f32c436-21f1-4001-8298-bdd263849977")
                .build();
    }

    public SayShalomStreamHandler() {
        super(getSkill());
    }

}