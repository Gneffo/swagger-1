package co.develhope.swagger.configurations;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(info =
@Info(
        title = "swagger",
        version = "1.0",
        description = "my API"
), tags ={@Tag(name = "name-controller",description = "name-controller description"),
@Tag(name = "default-controller",description = "default-controller description")})


@Configuration
public class Spring_Doc_Config {
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("springshop-public")
                .pathsToMatch("/public/**")
                .build();
    }
}
