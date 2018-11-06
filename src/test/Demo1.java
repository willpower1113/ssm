import com.willpower.entity.User;
import com.willpower.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class Demo1 {

    @Resource
    IUserService userService;

    @Test
    public void t1() {
        User user3 = new User("17796658480", "123456", "1");
//        List<User> mData = userService.filterUser(user3);
//        List<User> mData = userService.selectAllUser();
//        System.out.println(mData==null);
//        for (User user :
//                mData) {
//            System.out.println(user.toString());
//        }
    }

}
