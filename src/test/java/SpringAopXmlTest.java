import com.lxy.service.AopService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/applicationContext.xml")
public class SpringAopXmlTest {

    @Resource(name = "aopService")
    private AopService aopService;

    @Test
    public void testInsert() {
        aopService.insert();
    }

    @Test
    public void testUpdate() {
        aopService.update();
    }

}
