package com.codenation.endpoints;

import com.codenation.entity.LogError;
import com.codenation.enums.Level;
import com.codenation.service.impl.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/logs")
public class LogErrorController {
    @Autowired
    private LogService logService;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<LogError>> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(logService.findById(id));
    }

    @GetMapping("/{level}")
    public ResponseEntity<List<LogError>> findByLevel(@PathVariable("level") Level level) {
        return ResponseEntity.ok(logService.findByLevel(level));
    }
}
