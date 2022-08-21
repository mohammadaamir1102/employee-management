package com.example.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.constent.EMConstant;
import com.example.dto.EmployeManagementDTO;
import com.example.entity.EmployeeManagement;
import com.example.repsitory.EmployeeManagementRepository;
import com.example.service.EmployeeManagementService;

@Service
public class EmployeeManagementServiceImpl implements EmployeeManagementService {
	@Autowired
	private EmployeeManagementRepository employeeManagementRepository;

	@Override
	public EmployeeManagement saveEmployeeManagement(EmployeeManagement employeeManagement) {
		return employeeManagementRepository.save(employeeManagement);
	}

	@Override
	public List<EmployeManagementDTO> findAllEmployee() {

		List<EmployeeManagement> getAllEmployeeManagements = employeeManagementRepository.findAll();
//		List<EmployeeManagement> modifiedRecordsEmployeeManagements = getAllEmployeeManagements.stream()
//				.filter(isActiveRecords -> isActiveRecords.getIsActive().equalsIgnoreCase("Y"))
//				.collect(Collectors.toList());
		List<EmployeeManagement> findOnlyActiveData = findAllActiveRecordsEmployeeManagements(
				getAllEmployeeManagements);

		List<EmployeManagementDTO> employeManagementDTOs = new ArrayList<>();

		if (Objects.nonNull(getAllEmployeeManagements)) {
			for (EmployeeManagement employeeManagement : findOnlyActiveData) {

				EmployeManagementDTO employeManagementDTO = new EmployeManagementDTO();
				employeManagementDTO.setId(employeeManagement.getId());
				employeManagementDTO.setFirstName(employeeManagement.getFirstName());
				employeManagementDTO.setLastName(employeeManagement.getLastName());
				employeManagementDTO.setEmail(employeeManagement.getEmail());
				employeManagementDTO.setContact(employeeManagement.getContact());
				employeManagementDTO.setCity(employeeManagement.getCity());
				employeManagementDTO.setAddress(employeeManagement.getAddress());
				employeManagementDTO.setIsActive(employeeManagement.getIsActive());
				employeManagementDTOs.add(employeManagementDTO);
			}
		}
		return employeManagementDTOs;

	}

	private List<EmployeeManagement> findAllActiveRecordsEmployeeManagements(
			List<EmployeeManagement> getAllEmployeeManagements) {

		List<EmployeeManagement> shortingActiveData = new ArrayList<>();
		Iterator<EmployeeManagement> iterator = getAllEmployeeManagements.iterator();

		while (iterator.hasNext()) {
			EmployeeManagement employeeManagement = iterator.next();
			if (employeeManagement.getIsActive().equalsIgnoreCase("Y")) {
				shortingActiveData.add(employeeManagement);
			}
		}
		return shortingActiveData;

	}

	@Override
	public List<EmployeManagementDTO> getIdEmployee(EmployeManagementDTO employeManagementDTO) {
		Optional<EmployeeManagement> employeeManagementOptional = employeeManagementRepository
				.findById(employeManagementDTO.getId());
		List<EmployeManagementDTO> employeManagementDTOs = new ArrayList<>();
		if (Objects.nonNull(employeeManagementOptional)) {
			EmployeeManagement employeeManagement = employeeManagementOptional.get();
			employeeManagement.setFirstName(employeManagementDTO.getFirstName());
			employeeManagement.setLastName(employeManagementDTO.getLastName());
			employeeManagement.setEmail(employeManagementDTO.getEmail());
			employeeManagement.setContact(employeManagementDTO.getContact());
			employeeManagement.setCity(employeManagementDTO.getCity());
			employeeManagement.setAddress(employeManagementDTO.getAddress());
			employeeManagement.setIsActive(employeManagementDTO.getIsActive());
			employeeManagementRepository.save(employeeManagement);

		}
		return employeManagementDTOs;

	}

	@Override
	public EmployeManagementDTO findEmployeManagementById(Long id) {

		try {
			Optional<EmployeeManagement> employeeManagementOptional = employeeManagementRepository
					.findByIdAndIsActive(id, EMConstant.IS_ACTIVE);
			EmployeeManagement employeeManagement = employeeManagementOptional.get();

			if (employeeManagementOptional.isPresent()) {
				EmployeManagementDTO employeManagementDTO = new EmployeManagementDTO();
				employeManagementDTO.setId(employeeManagement.getId());
				employeManagementDTO.setFirstName(employeeManagement.getFirstName());
				employeManagementDTO.setLastName(employeeManagement.getLastName());
				employeManagementDTO.setEmail(employeeManagement.getEmail());
				employeManagementDTO.setContact(employeeManagement.getContact());
				employeManagementDTO.setCity(employeeManagement.getCity());
				employeManagementDTO.setAddress(employeeManagement.getAddress());
				employeManagementDTO.setIsActive(employeeManagement.getIsActive());
				return employeManagementDTO;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<EmployeeManagement> findAllEmployee1() {
		List<EmployeeManagement> findEmployeeManagements = employeeManagementRepository.findAll();
		List<EmployeeManagement> findOnlyActiveEmployeeManagements = findEmployeeManagements.stream()
				.filter(findOnlyActiveData -> findOnlyActiveData.getIsActive().equalsIgnoreCase(EMConstant.IS_ACTIVE))
				.collect(Collectors.toList());

		return findOnlyActiveEmployeeManagements;
	}

	@Override
	public List<EmployeeManagement> findByFirstNameAndLastName(String firstNameString, String lastName) {
		List<EmployeeManagement> findByFirstNameAndLastName = employeeManagementRepository
				.findByFirstNameAndLastName(firstNameString, lastName);
		if (Objects.nonNull(findByFirstNameAndLastName)) {
			return findByFirstNameAndLastName;
		}
		return null;
	}

	@Override
	public List<EmployeeManagement> findByIdIn(List<Long> findByIdInDTOs) {
		List<EmployeeManagement> findByIdIn = employeeManagementRepository.findByIdIn(findByIdInDTOs);
		System.out.println(findByIdIn);
		return findByIdIn;
	}

}
