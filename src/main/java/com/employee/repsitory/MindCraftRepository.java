package com.employee.repsitory;

import com.employee.entity.MindCraftCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MindCraftRepository extends JpaRepository<MindCraftCompany, Long> {
}
