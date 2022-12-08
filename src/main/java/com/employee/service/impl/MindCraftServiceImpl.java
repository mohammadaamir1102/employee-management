package com.employee.service.impl;

import com.employee.entity.MindCraftCompany;
import com.employee.repsitory.MindCraftRepository;
import com.employee.service.MindCraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MindCraftServiceImpl implements MindCraftService {

    @Autowired
    private MindCraftRepository mindCraftRepository;

    @Override
    public MindCraftCompany saveDeveloper(MindCraftCompany mindCraftCompany) {
        System.out.println("mindCraft" + mindCraftCompany);
        return mindCraftRepository.save(mindCraftCompany);
    }

    @Override
    public Optional<MindCraftCompany> getDeveloper(Long companyId) throws Exception {
        Optional<MindCraftCompany> mindCraftCompany = mindCraftRepository.findById(companyId);
        if (!mindCraftCompany.isPresent()) {
            throw new Exception("Data is not present");
        }
        return mindCraftCompany;
    }
}
