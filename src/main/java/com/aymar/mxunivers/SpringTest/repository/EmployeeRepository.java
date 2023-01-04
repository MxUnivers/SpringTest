package com.aymar.mxunivers.SpringTest.repository;

import com.aymar.mxunivers.SpringTest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
