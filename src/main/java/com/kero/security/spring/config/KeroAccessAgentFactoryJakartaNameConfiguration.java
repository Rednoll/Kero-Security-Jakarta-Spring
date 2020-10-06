package com.kero.security.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kero.security.core.agent.KeroAccessAgentFactory;
import com.kero.security.core.agent.configurator.AccessAgentJakartaNameConfigurator;

@Component
public class KeroAccessAgentFactoryJakartaNameConfiguration implements KeroAccessAgentFactorySpringConfiguration {
	
	@Autowired
	private AccessAgentJakartaNameConfigurator config;
	
	@Override
	public void configure(KeroAccessAgentFactory factory) {
	
		factory.addConfigurator(config);
	}
}
