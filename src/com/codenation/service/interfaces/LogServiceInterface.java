package com.codenation.service.interfaces;

import com.codenation.entity.LogError;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface LogServiceInterface {
    Optional<LogError> findById(Long id);
    List<LogError> findByDate(Date dateLog);
}
