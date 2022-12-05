package mall.common;


import mall.BoundedContext947Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext947Application.class })
public class CucumberSpingConfiguration {
    
}
