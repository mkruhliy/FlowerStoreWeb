package flowershop.flowershopweb;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlowershopwebAppConfig {
    @Bean
    public String getData() {
        return "hello out of bean";
    }
}
