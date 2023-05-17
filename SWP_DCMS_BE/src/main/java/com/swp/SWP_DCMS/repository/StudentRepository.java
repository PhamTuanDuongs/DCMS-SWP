package com.swp.SWP_DCMS.repository;

import com.swp.SWP_DCMS.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
