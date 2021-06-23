import com.lxy.config.SpringConfig;
import com.lxy.service.AopService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class SpringAopAnnotationTest {

    @Autowired
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
