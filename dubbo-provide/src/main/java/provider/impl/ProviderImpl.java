package provider.impl;

import api.IService;
import org.springframework.stereotype.Service;

@Service(value = "demoService")
public class ProviderImpl implements IService {
    @Override
    public void test() {
        System.out.println("etqreqwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
    }
}
