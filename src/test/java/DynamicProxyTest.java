import com.lxy.config.DynamicProxyConfig;
import com.lxy.service.AopService;
import com.lxy.service.impl.AopServiceImpl;
import com.lxy.util.DynamicProxyUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * AOP测试：JDK动态代理
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DynamicProxyConfig.class)
public class DynamicProxyTest {

    @Resource(name = "dynamicProxyUtil")
    private DynamicProxyUtil proxyUtil;

    @Test
    public void testInsert() {
        AopService aopService = proxyUtil.getProxyObject(AopServiceImpl.class);
        aopService.insert();
    }

    @Test
    public void testUpdate() {
        AopService aopService = proxyUtil.getProxyObject(AopServiceImpl.class);
        aopService.update();
    }

}
