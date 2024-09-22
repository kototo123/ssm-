package com.kototo.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Integer empId;
    private String empName;
    private Double empSalary;
    private Integer deptId;
}