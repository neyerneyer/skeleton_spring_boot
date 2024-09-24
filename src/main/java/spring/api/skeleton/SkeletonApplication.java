package spring.api.skeleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SkeletonApplication {

    @GetMapping("/pepeSpringboot")
    public String pepeSpringboot() {
        return "Este es mi primer uso en spring boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(SkeletonApplication.class, args);
    }

}
