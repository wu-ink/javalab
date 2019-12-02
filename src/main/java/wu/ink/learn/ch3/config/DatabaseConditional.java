package wu.ink.learn.ch3.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DatabaseConditional implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// Get env
		Environment env = context.getEnvironment();
		// check database config
		return env.containsProperty("database.driverName")
				&& env.containsProperty("database.url")
				&& env.containsProperty("database.username")
				&& env.containsProperty("database.password");
	}

}
