package com.microservicepractice.employeeservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizeConfig;

@Configuration
public class HazlecastCacheConfig {

	
	@Bean
    public Config hazelcastConfig(){
       return new Config().setInstanceName("hazelcast-instance")
                .addMapConfig(new MapConfig().setName("employeeCache")
                .setMaxSizeConfig(new MaxSizeConfig(300,MaxSizeConfig.MaxSizePolicy.FREE_HEAP_SIZE))
                .setEvictionPolicy(EvictionPolicy.LRU)
                .setTimeToLiveSeconds(2000));
    }

	
}
