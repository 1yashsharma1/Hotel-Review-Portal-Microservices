package com.hotel.rating.service.configs;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationMapper {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
