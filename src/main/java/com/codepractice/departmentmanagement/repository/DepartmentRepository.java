package com.codepractice.departmentmanagement.repository;

import com.codepractice.departmentmanagement.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//Here in repo we will pass out entity with entity's ID type
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
