package com.leucine.LeucineCDMS.repository;

import com.leucine.LeucineCDMS.model.FacultyProfile;
import com.leucine.LeucineCDMS.model.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacultyProfileRepository extends JpaRepository<FacultyProfile, Long> {
}