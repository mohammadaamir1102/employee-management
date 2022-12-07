package com.employee.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class  MindCraftCompany {

    @Id
    @GeneratedValue(generator = "companyIdSequence")
    @SequenceGenerator(name = "companyIdSequence", sequenceName = "MindCraftCompany_companyId", allocationSize = 1)
    private Long companyId;
    private String companyName;
    private String companyAddress;
    @OneToMany(targetEntity = Developer.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "md_fk", referencedColumnName = "companyId")
    private List<Developer> developer;
}
