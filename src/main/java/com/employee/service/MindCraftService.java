package com.employee.service;

import com.employee.entity.MindCraftCompany;

import java.util.List;
import java.util.Optional;

public interface MindCraftService {
    MindCraftCompany saveDeveloper(MindCraftCompany mindCraftCompany);

    Optional<MindCraftCompany> getDeveloper(Long companyId) throws Exception;
}
