package com.ssafy.home.Heo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Value("${swagger.uri}")
    private String swaggerUri;

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .addServersItem(new Server().url(swaggerUri))
                .info(apiInfo());
    }

    private Info apiInfo() {
        return new Info()
                .title("SSAFY HOME 문서")
                .description("00 API 테스트를 위한 Swagger UI")
                .version("1.0.0");
    }
}
