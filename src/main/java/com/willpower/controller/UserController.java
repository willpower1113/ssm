package com.willpower.controller;

import com.willpower.entity.User;
import com.willpower.model.ResponseBean;
import com.willpower.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
@SessionAttributes(names = "list")
public class UserController {
    @Resource
    private IUserService userService;

    /*
    用户注册
       */
    @RequestMapping("/register")
    public ModelAndView userRegister(String phone, String password, String userIdentity) {
        User user = new User(phone, password, userIdentity);
        List<User> back = userService.filterUser(user);
        ModelAndView modelAndView = new ModelAndView();
        try {
            if (back != null && back.size() > 0) {
                Thread.sleep(2000);
                for (int i = 0; i < back.size(); i++) {
                    System.out.println("User:" + back.get(i).toString());
                }
                modelAndView.addObject("data", new ResponseBean<User>(null, 2, "手机号已注册过"));
            } else {
                int code = userService.addUser(user);
                if (code > 0) {
                    modelAndView.addObject("data", new ResponseBean<User>(user, 1, "注册成功"));
                } else {
                    modelAndView.addObject("data", new ResponseBean<User>(null, 2, "注册失败"));
                }
            }
            modelAndView.setView(new MappingJackson2JsonView());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return modelAndView;
    }

    /*
    用户登录
   */
    @RequestMapping("/login")
    public ModelAndView userLogin(String phone, String password, String userIdentity) {
        System.out.println("用户登录");
        User data = userService.login(new User(phone, password, userIdentity));
        ModelAndView modelAndView = new ModelAndView();
        try {
            Thread.sleep(2000);
            if (data != null) {
                System.out.println(data.toString());
                modelAndView.addObject("data", new ResponseBean<>(data, 1, "登录成功！"));
            } else {
                modelAndView.addObject("data", new ResponseBean<User>(null, 2, "用户名或者密码错误！"));
            }
            modelAndView.setView(new MappingJackson2JsonView());
            System.out.println("response:" + modelAndView.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return modelAndView;
    }

    /*
    查询所有
     */
    public List<User> selectAllUser() {
        return null;
    }


    /*
    模糊查询
     */
    public List<User> filterUser(User user) {
        return null;
    }


    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }
}
