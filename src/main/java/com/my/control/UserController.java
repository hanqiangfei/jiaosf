package com.my.control;

import com.my.entity.MpAppUsers;
import com.my.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index")
    public String index(){
        System.out.println("requestMapping-index");
        return "user/index";
    }

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    @ResponseBody
    public String show(@RequestParam(value = "loginId")String loginId){
        MpAppUsers user = userService.findUserByLoginId(loginId);
        if(null != user)
            return user.getLoginId()+"/"+user.getUserName()+"/"+user.getDeptName();
        else return "null";
    }

    @RequestMapping(value = "/showDetail",method = RequestMethod.GET)
    @ResponseBody
    public MpAppUsers showDetailWithLoginId(@RequestParam(value = "loginId")String loginId){
        return userService.findUserByLoginId(loginId);
    }

}
