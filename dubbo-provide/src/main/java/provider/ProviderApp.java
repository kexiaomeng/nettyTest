package provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

@SpringBootApplication

@ImportResource(locations = {"classpath:spring.xml"})
//@ImportResource("classpath:spring.xml")
public class ProviderApp {
    public static void main(String [] args) throws IOException {
        SpringApplication.run(ProviderApp.class);
        System.out.println();
        System.in.read();
    }
}
