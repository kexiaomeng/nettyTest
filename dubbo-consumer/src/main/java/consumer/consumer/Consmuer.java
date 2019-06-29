package consumer.consumer;

import api.IService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Consmuer {
    @Resource(name = "demoService")
    private IService service;

    public void consumer() {
        service.test();
    }
}
