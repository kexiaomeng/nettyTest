package consumer.consumer;

import api.IService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Consmuer {
    @Resource(name = "demoService")
    private IService service;


//    @Resource(name = "test")
//    private IService service1;

    public void consumer() throws InterruptedException {
        service.test();
//        while (true) {
//            Thread.sleep(10000L);
//        }
    }
}
