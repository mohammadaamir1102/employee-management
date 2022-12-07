package com.employee.service.impl;

import com.employee.entity.MindCraftCompany;
import com.employee.repsitory.MindCraftRepository;
import com.employee.service.MindCraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MindCraftServiceImpl implements MindCraftService {

    @Autowired
    private MindCraftRepository mindCraftRepository;
    @Override
    public MindCraftCompany saveDeveloper(MindCraftCompany mindCraftCompany) {
        return mindCraftRepository.save(mindCraftCompany);
    }
}
