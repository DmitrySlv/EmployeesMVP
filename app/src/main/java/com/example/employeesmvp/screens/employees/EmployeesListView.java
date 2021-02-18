package com.example.employeesmvp.screens.employees;

import com.example.employeesmvp.pojo.Employee;

import java.util.List;

public interface EmployeesListView {
    void showData(List<Employee> employees);
    void showError();
}
