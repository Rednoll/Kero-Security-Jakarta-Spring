package com.kero.security.core.agent.configurator;

import org.springframework.stereotype.Component;

import com.kero.security.core.agent.KeroAccessAgent;
import com.kero.security.core.agent.configuration.KeroAccessAgentConfigurator;
import com.kero.security.core.scheme.configurator.JakartaNameAccessSchemeConfigurator;

@Component
public class AccessAgentJakartaNameConfigurator implements KeroAccessAgentConfigurator {

	@Override
	public void configure(KeroAccessAgent agent) {
	
		agent.addConfigurator(new JakartaNameAccessSchemeConfigurator());
	}
}
