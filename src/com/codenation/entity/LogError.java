package com.codenation.entity;

import com.codenation.enums.LogErrorEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="logs")
public class LogError {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private LogErrorEnum level;

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
    private Date dateLog;

    @JsonIgnore
    @ManyToOne
    private List<User> user;
}
