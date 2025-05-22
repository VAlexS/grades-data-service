package com.iron.grades_data_service.clients;

import com.iron.grades_data_service.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "student-info-service")
public interface UserFeignClient {

    @GetMapping("/api/student/{id}")
    StudentDTO getStudentById(@PathVariable int id);
}
