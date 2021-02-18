package com.example.employeesmvp.api;

import com.example.employeesmvp.pojo.Employee;
import com.example.employeesmvp.pojo.EmployeeResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiService {
    @GET("testTask.json")
    Observable<EmployeeResponse> getEmployees();
}
