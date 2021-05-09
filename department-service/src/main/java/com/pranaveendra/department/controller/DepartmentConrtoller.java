package com.pranaveendra.department.controller;

import com.pranaveendra.department.entity.Department;
import com.pranaveendra.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentConrtoller {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department  department) {
        log.info("inside savedepartment of DepartmentConrtoller");
        return departmentService.saveDepartment(department);

    }
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long id ) {
        log.info("inside findDepartmentById of DepartmentConrtoller");
        return  departmentService.findDepartmentById(id);
    }
}
