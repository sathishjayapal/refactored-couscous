package me.sathish.aiwingedproject.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("me.sathish.aiwingedproject.domain")
@EnableJpaRepositories("me.sathish.aiwingedproject.repos")
@EnableTransactionManagement
public class DomainConfig {
}
