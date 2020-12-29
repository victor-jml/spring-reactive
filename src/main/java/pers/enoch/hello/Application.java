package pers.enoch.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author yang.zhao
 * Date: 2020/12/29
 * Description:
 **/
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        GreetingWebClient greetingWebClient = new GreetingWebClient();
        System.out.println(greetingWebClient.getResult());
    }
}
