package com.codepractice.departmentmanagement.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DepartmentModel {
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
