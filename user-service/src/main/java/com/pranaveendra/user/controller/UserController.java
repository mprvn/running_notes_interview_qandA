package com.pranaveendra.user.controller;

import com.pranaveendra.user.entity.User;
import com.pranaveendra.user.service.UserService;
import com.pranaveendra.user.valueobject.Department;
import com.pranaveendra.user.valueobject.ResponseTemplateVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired  private UserService userService;
    @Autowired private RestTemplate restTemplate;
    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        log.info("inside saveUser method in userController ");
        return userService.saveUser(user);
    }
    @GetMapping("/{userId}")
    public ResponseTemplateVo getUserWithDepartment(@PathVariable("userId") Long id){
        ResponseTemplateVo  vo = new ResponseTemplateVo();
        User user = userService.findUserByUserId(id);
        Department department = restTemplate.getForObject("http://localhost:9090/departments/"+user.getDepartmentId(), Department.class);
        vo.setUser(user);
        vo.setDepartment(department);

        return vo;
    }
}
