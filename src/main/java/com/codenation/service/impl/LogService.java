package com.codenation.service.impl;

import com.codenation.entity.LogError;
import com.codenation.enums.Level;
import com.codenation.repository.LogRepository;
import com.codenation.service.interfaces.LogServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LogService implements LogServiceInterface {
    @Autowired
    private LogRepository logRepository;

    @Override
    public Optional<LogError> findById(Long id) {
        return logRepository.findById(id);
    }

    @Override
    public List<LogError> findByLevel(Level level) {
        return logRepository.findByLevel(level);
    }
}
