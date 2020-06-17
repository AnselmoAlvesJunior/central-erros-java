package com.codenation.entity;

import com.codenation.enums.Level;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="logs")
public class LogError {

    @EmbeddedId
    private LogErrorPk id;

    @Enumerated(EnumType.STRING)
    private Level level;

    @Column
    @NotNull
    private String description;

    @Column
    @NotNull
    private String sourceIssue;

    @Column
    @NotNull
    private int quantity;

    @Column
    @CreatedDate
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime dateLog;

    public LogError(LogErrorPk id, Level level, LocalDateTime dateLog) {
        this.id = id;
        this.level = level;
        this.dateLog = dateLog;
    }

}
