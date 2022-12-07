package com.employee.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long developerId;
    private String developerName;
    private String developerAddress;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Timestamp developerDOB;

    @ManyToOne
    private MindCraftCompany mindCraftCompany;
}
