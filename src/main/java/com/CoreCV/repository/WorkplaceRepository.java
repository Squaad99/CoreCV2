package com.CoreCV.repository;

import com.CoreCV.entity.WorkPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkplaceRepository extends JpaRepository<WorkPlace, Long> {


}
