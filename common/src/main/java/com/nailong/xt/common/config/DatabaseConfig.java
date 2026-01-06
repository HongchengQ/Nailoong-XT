package com.nailong.xt.common.config;

import org.babyfish.jimmer.sql.meta.DatabaseNamingStrategy;
import org.babyfish.jimmer.sql.runtime.DefaultDatabaseNamingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {
    @Bean
    public DatabaseNamingStrategy databaseNamingStrategy() {
        return DefaultDatabaseNamingStrategy.LOWER_CASE;
    }

}
