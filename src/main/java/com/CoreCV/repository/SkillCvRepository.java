package com.CoreCV.repository;

import com.CoreCV.entity.SkillCv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillCvRepository extends JpaRepository<SkillCv, Long> {
}
