package consumer;


import consumer.consumer.Consmuer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = "classpath:consumer.xml")
public class ConsumerApp implements CommandLineRunner {

    @Autowired
    private Consmuer consmuer;

    public static void main(String args[]) {
        SpringApplication.run(ConsumerApp.class);
    }

    public void run(String... args) throws Exception {
        consmuer.consumer();
    }
}
