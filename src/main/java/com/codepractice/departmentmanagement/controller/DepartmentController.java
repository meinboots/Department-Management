package com.codepractice.departmentmanagement.controller;

import com.codepractice.departmentmanagement.entity.Department;
import com.codepractice.departmentmanagement.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    //Create Department
    @PostMapping("/departments")
    public Department createDepartment(@Valid @RequestBody Department department){

        return departmentService.saveDepartment(department);

    }
    //Fetch Departments
     @GetMapping("/departments")
    public List<Department> fetchDepartments(){
        return departmentService.fetchDepartments();
    }

    //Fetch Department by ID
    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
            return departmentService.fetchDepartmentById(departmentId);
    }

    //Delete department by ID
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted successfully";
    }
    //Update department by ID
    @PutMapping("/departments/{id}")
    public Department updateDepartmentById(@PathVariable("id") Long departmentId, @RequestBody Department department){
        return departmentService.updateDepartmentById(departmentId, department);
    }

    //Fetch department by department name
    @GetMapping("/departments/name/{departName}")
    public Department fetchDepartmentByName(@PathVariable("departName") String departmentName){
        return departmentService.fetchDepartmentByName(departmentName);
    }

}
