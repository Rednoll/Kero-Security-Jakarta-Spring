package com.kero.security.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.kero.security.core.agent.KeroAccessAgentFactory;
import com.kero.security.core.agent.configurator.AccessAgentEntityNameConfigurator;

@Configuration
public class KeroAccessAgentFactoryEntityNameConfiguration implements KeroAccessAgentFactorySpringConfiguration {
	
	@Value("${kero.security.jakarta.entity.name.enabled:true}")
	private boolean entityNameEnabled;

	@Autowired
	private AccessAgentEntityNameConfigurator configurator;
	
	@Override
	public void configure(KeroAccessAgentFactory factory) {
	
		if(this.entityNameEnabled) {
			
			factory.addConfigurator(this.configurator);
		}
	}
}
