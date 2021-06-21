import com.lxy.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserControllerTest {

    @Test
    public void testInsert() {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        UserController userController = (UserController) context.getBean("userController");
        userController.insert();
    }

}
