package com.kero.security.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.kero.security.core.agent.KeroAccessAgentFactory;
import com.kero.security.core.agent.configurator.AccessAgentJakartaNameConfigurator;

@Configuration
public class KeroAccessAgentFactoryJakartaNameConfiguration implements KeroAccessAgentFactorySpringConfiguration {
	
	@Value("${kero.security.jakarta.entity.name:true}")
	private boolean entityName;

	@Autowired
	private AccessAgentJakartaNameConfigurator configurator;
	
	@Override
	public void configure(KeroAccessAgentFactory factory) {
	
		if(this.entityName) {
			
			factory.addConfigurator(this.configurator);
		}
	}
}
