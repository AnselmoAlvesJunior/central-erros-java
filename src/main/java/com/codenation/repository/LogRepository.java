package com.codenation.repository;

import com.codenation.entity.LogError;
import com.codenation.enums.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface LogRepository extends JpaRepository<LogError,Long> {

    Optional<LogError> findById(Long id);

    List<LogError> findByLevel(Level level);
}
