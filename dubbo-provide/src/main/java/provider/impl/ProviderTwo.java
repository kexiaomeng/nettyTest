package provider.impl;


import api.IService;
import org.springframework.stereotype.Service;

@Service(value = "test")
public class ProviderTwo implements IService {
    @Override
    public void test() {
        System.out.println("调用服务");
    }
}


