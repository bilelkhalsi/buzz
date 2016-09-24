/**
 * @author Bilel
 * Created : 22:54:11
 * Copyright : Bilel KHALSI
 */
package com.buzz.rest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

/**
 * TODO : JavaDoc
 * 
 */
@Configuration
public class BuzzRestConfiguration extends RepositoryRestMvcConfiguration {

	/* (non-Javadoc)
	 * @see org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration#configureRepositoryRestConfiguration(org.springframework.data.rest.core.config.RepositoryRestConfiguration)
	 */
	@Override
	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		
		super.configureRepositoryRestConfiguration(config);
	}
}
