import com.lxy.config.CglibProxyConfig;
import com.lxy.service.AopService;
import com.lxy.service.impl.AopServiceImpl;
import com.lxy.util.CglibProxyUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * AOP测试：CGLIB动态代理
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CglibProxyConfig.class)
public class CglibProxyTest {

    @Resource(name = "cglibProxyUtil")
    private CglibProxyUtil proxyUtil;

    @Test
    public void testInsert() {
        AopService proxyObj = proxyUtil.getProxyObject(AopServiceImpl.class);
        proxyObj.insert();
    }

    @Test
    public void testUpdate() {
        AopService proxyObj = proxyUtil.getProxyObject(AopServiceImpl.class);
        proxyObj.update();
    }

}
