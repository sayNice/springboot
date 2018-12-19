package com.myphoto.springboot.controller;

import com.myphoto.springboot.mapper.UserMapper;
import com.myphoto.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserMapper userMapper;

    @RequestMapping(value="/getAllUser")
    public String getAllUser(Model model){
        List<User> user = userMapper.findUserAll();
        model.addAttribute("user",user);
        return "userList";
    }
    @RequestMapping(value="/insertUser")
    public String getAllUser(User user){
        userMapper.insertUser(user);
        return "redirect:/user/getAllUser";
    }
}
