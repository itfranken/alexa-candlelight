package invocation;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;
import handlers.CancelandStopIntentHandler;
import handlers.HelloWorldIntentHandler;
import handlers.FallbackIntentHandler;
import handlers.HelpIntentHandler;
import handlers.LaunchRequestHandler;
import handlers.SessionEndedRequestHandler;

public class CandleStreamHandler extends SkillStreamHandler {

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

    public CandleStreamHandler() {
		super(getSkill());
    }

}