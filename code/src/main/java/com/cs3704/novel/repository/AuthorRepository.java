package com.cs3704.novel.repository;

import com.cs3704.novel.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author findByUserName(@Param("userName") String username);
}
