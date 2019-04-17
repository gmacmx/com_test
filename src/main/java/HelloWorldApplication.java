import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloWorldApplication extends SpringBootServletInitializer {

    @RequestMapping(value = "/sayHello")
    @ResponseBody
    public String sayHello(String name){
        return "Hello,gma2019" + name;
    }

    @RequestMapping(value="/hi")
    @ResponseBody
    public String hi(){
        return "hi";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(HelloWorldApplication.class);
    }
}