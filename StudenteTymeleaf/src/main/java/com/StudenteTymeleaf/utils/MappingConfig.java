package com.StudenteTymeleaf.utils;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

@Configuration
public class MappingConfig  {
	
	
	@Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        // configure ModelMapper
        modelMapper.getConfiguration()
            .setMatchingStrategy(MatchingStrategies.STRICT);

        return modelMapper;
    }
}
	
