import com.lxy.controller.CustomerController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerControllerTest {

    @Test
    public void testSave() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        CustomerController customerController = (CustomerController) applicationContext.getBean("customerController");
        customerController.save();
    }

}
