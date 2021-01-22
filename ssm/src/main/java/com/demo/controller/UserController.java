package com.demo.controller;


import com.demo.domain.User;
import com.demo.service.UserService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(){
        return "test success";
    }

    @RequestMapping("/save")
    public String save(User user /*, HttpServletRequest request,HttpServletResponse response*/) throws ServletException, IOException {
       userService.save(user);
        List<User> allUser = userService.findAllUser();
        List<User> userList=userService.findAllUser();
       /* request.setAttribute("userList",userList);
        request.getRequestDispatcher("userList").forward(request,response);*/
        return "redirect:/user/userList";
    }


    @RequestMapping("userList")
    public ModelAndView userList(ModelAndView modelAndView){
        List<User> userList=userService.findAllUser();
        modelAndView.addObject("userList",userList);
        modelAndView.setViewName("userList");
        return modelAndView;
    }


}
