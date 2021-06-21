import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * 测试连接池
 */
public class testDruid {

    @Test
    public void testDataSource() {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
            DataSource dataSource = context.getBean("dataSource", DataSource.class);
            Connection connection = dataSource.getConnection();
            System.out.println(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
