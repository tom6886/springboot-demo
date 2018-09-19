package tb.springboot.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"tb.springboot.api.*", "tb.springboot.service.*", "tb.springboot.common.*", "tb.springboot.data.config"})
@MapperScan(basePackages = "tb.springboot.data.dao")
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
