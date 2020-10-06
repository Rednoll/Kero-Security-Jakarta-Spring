package com.kero.security.spring.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.kero.security.core.agent.KeroAccessAgent;
import com.kero.security.core.agent.configurator.KeroAccessAgentConfiguratorBeans;
import com.kero.security.core.scheme.AccessScheme;
import com.kero.security.spring.config.KeroAccessAgentBean;
import com.kero.security.spring.config.KeroAccessAgentFactoryBean;
import com.kero.security.spring.config.KeroAccessAgentFactoryEntityNameConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {KeroAccessAgentBean.class, KeroAccessAgentConfiguratorBeans.class, KeroAccessAgentFactoryEntityNameConfiguration.class, KeroAccessAgentFactoryBean.class})
@ActiveProfiles("test")
public class MainTest {

	@Autowired
	private KeroAccessAgent agent;
	
	@Test
	public void test() {
		
		AccessScheme scheme = agent.getOrCreateScheme(EntityNameTestEntity.class);
	
		assertEquals(scheme.getName(), "Jakarta");
	}
}
