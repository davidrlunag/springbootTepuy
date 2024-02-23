
package com.example.tepuy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tepuy.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}