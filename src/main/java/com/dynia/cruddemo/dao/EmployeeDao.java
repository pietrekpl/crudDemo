package com.dynia.cruddemo.dao;


import com.dynia.cruddemo.entity.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
public interface EmployeeDao  {
    public List<Employee>findAll();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public  void deleteById(int theId);

}
