package com.bridgelabz.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class EmployeePayRollAppApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to Emp payroll");
        SpringApplication.run(EmployeePayRollAppApplication.class, args);
    }

}
