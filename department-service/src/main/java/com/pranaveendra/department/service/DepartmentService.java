package com.pranaveendra.department.service;

import com.pranaveendra.department.entity.Department;
import com.pranaveendra.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Optional<Department> findDepartment(Long id) {
        return departmentRepository.findById(id);
    }

    public Department findDepartmentById(Long id) {
        return departmentRepository.findDepartmentById(id);
    }
}
