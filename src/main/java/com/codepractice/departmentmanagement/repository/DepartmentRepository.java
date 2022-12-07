package com.codepractice.departmentmanagement.repository;

import com.codepractice.departmentmanagement.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


//Here in repo we will pass out entity with entity's ID type
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    //Here we will define method name as entity name to create custom find methods like below :

    //@Query("") -> Pass your custom query here in case your wants fetch some complex data..,
    public Department findByDepartmentName(String departmentName); //As input parameter
    public Department findByDepartmentNameIgnoreCase(String departmentName); //As input parameter, Method for case Ignoring
}
