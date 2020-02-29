import edu.UserService;
import edu.UserServiceImpl;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring-config.xml")
public class SpringTest {

    @Autowired
    private UserService userService;

    @Test
    public void Test(){
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("");
        userService.getUserName();
    }
}
