package com.CoreCV.repository;

import com.CoreCV.entity.Title;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitleRepository extends JpaRepository<Title, Long> {

    Title save(Title title);
}
