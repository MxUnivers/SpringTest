package com.aymar.mxunivers.SpringTest.service;


import com.aymar.mxunivers.SpringTest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
