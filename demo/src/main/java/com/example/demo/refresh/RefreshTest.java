package com.example.demo.refresh;//package com.nari.apollotest.refresh;

        import com.ctrip.framework.apollo.model.ConfigChangeEvent;
        import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
        import com.example.demo.TestJavaConfigBean;
        import lombok.extern.slf4j.Slf4j;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.cloud.context.scope.refresh.RefreshScope;
        import org.springframework.stereotype.Component;
        import javax.annotation.Resource;

@Component
@Slf4j
public class RefreshTest {

    @Resource(name = "javaConfigBean")
    private TestJavaConfigBean javaConfigBean;
    @Autowired
    private RefreshScope refreshScope;



    @ApolloConfigChangeListener
    public void onEvent(ConfigChangeEvent changeEvent) {
        log.info("before refresh {}", javaConfigBean.toString());
        refreshScope.refresh("javaConfigBean");
        log.info("after refresh {}", javaConfigBean.toString());
    }
}
