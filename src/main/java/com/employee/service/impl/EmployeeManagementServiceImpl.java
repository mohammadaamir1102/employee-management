package com.employee.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import com.employee.dto.EmployeeManagementContactDTO;
import com.employee.dto.PhaseVo;
import com.employee.java8.Vo.ClientVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.employee.constant.EMConstant;
import com.employee.dto.EmployeeManagementDTO;
import com.employee.entity.EmployeeManagement;
import com.employee.mapper.EmployeeManagementMapper;
import com.employee.repsitory.EmployeeManagementRepository;
import com.employee.service.EmployeeManagementService;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Service
public class EmployeeManagementServiceImpl implements EmployeeManagementService {
    @Autowired
    private EmployeeManagementRepository employeeManagementRepository;

    @Autowired
    private EmployeeManagementMapper employeeManagementMapper;

    @Value("classpath:" + EMConstant.EXCEL_FILE_NAME_AAMIR_KHAN)
    Resource aamirKhanResource;
    @Value("classpath:" + EMConstant.EXCEL_FILE_NAME_SALMAN_KHAN)
    Resource salmanKhanResource;

    @Override
    public EmployeeManagement saveEmployeeManagement(EmployeeManagement employeeManagement) {
        return employeeManagementRepository.save(employeeManagement);
    }

    @Override
    public List<EmployeeManagementDTO> findAllEmployee() {

        List<EmployeeManagement> getAllEmployeeManagements = employeeManagementRepository.findAll();
//		List<EmployeeManagement> modifiedRecordsEmployeeManagements = getAllEmployeeManagements.stream()
//				.filter(isActiveRecords -> isActiveRecords.getIsActive().equalsIgnoreCase("Y"))
//				.collect(Collectors.toList());
        List<EmployeeManagement> findOnlyActiveData = findAllActiveRecordsEmployeeManagements(
                getAllEmployeeManagements);

        List<EmployeeManagementDTO> employeManagementDTOs = new ArrayList<>();

        if (Objects.nonNull(getAllEmployeeManagements)) {
            for (EmployeeManagement employeeManagement : findOnlyActiveData) {

                EmployeeManagementDTO employeManagementDTO = new EmployeeManagementDTO();
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
    public List<EmployeeManagementDTO> getIdEmployee(EmployeeManagementDTO employeManagementDTO) {
        Optional<EmployeeManagement> employeeManagementOptional = employeeManagementRepository
                .findById(employeManagementDTO.getId());
        String userName = getEmployeeUserName(employeManagementDTO.getId()).get().getFirstName();
        System.out.println(userName);
        List<EmployeeManagementDTO> employeManagementDTOs = new ArrayList<>();
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
    public EmployeeManagementDTO findEmployeManagementById(Long id) {

        try {
            Optional<EmployeeManagement> employeeManagementOptional = employeeManagementRepository
                    .findByIdAndIsActive(id, EMConstant.IS_ACTIVE);
            checkNullPointerForLearningPurpose(employeeManagementOptional);
            if (employeeManagementOptional.isPresent()) {
                EmployeeManagement employeeManagement = employeeManagementOptional.get();

                EmployeeManagementDTO employeeManagementToEmpployeeManagementDto = employeeManagementMapper
                        .employeeManagementToEmpployeeManagementDto(employeeManagement);
                return employeeManagementToEmpployeeManagementDto;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private void checkNullPointerForLearningPurpose(Optional<EmployeeManagement> employeeManagement) {

        ClientVO clientVO = new ClientVO();
        clientVO.setfTsar(employeeManagement.map(EmployeeManagement::getLastName).orElseGet(() -> "Hellow"));
        System.out.println("client value" + clientVO.getfTsar());

    }

    private Optional<EmployeeManagement> getEmployeeUserName(Long id) {
        Optional<EmployeeManagement> employeeManagementOptional = employeeManagementRepository
                .findByIdAndIsActive(id, EMConstant.IS_ACTIVE);
        return Optional.ofNullable(employeeManagementOptional.get());

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

    @Override
    public String deleteUserPermanently(Long id) throws Exception {
        EmployeeManagement employeeManagement = employeeManagementRepository
                .findById(id).orElseThrow(() -> new Exception("Employee not found for this id : " + id));
        employeeManagementRepository.delete(employeeManagement);
        return "Employee id: " + id + " has been deleted successfully !";
    }

    @Override
    public String inActiveUser(Long id) throws Exception {
        EmployeeManagement employeeManagement = employeeManagementRepository
                .findById(id).orElseThrow(() -> new Exception("Employee not found for this id : " + id));
        employeeManagement.setIsActive(EMConstant.IN_ACTIVE);
        employeeManagementRepository.save(employeeManagement);
        return "Employee id: " + id + " has been in active successfully !";
    }

    @Override
    public Optional<EmployeeManagement> getEmployeeBasedOnContact(EmployeeManagementContactDTO employeeManagementContactDTO) {
        Optional<EmployeeManagement> byContactAndIsActive = employeeManagementRepository.findByContactAndIsActive(employeeManagementContactDTO.getContact(),
                employeeManagementContactDTO.getIsActive());
        //here if got two record then got exception because optional is not LIST
        if (byContactAndIsActive.isPresent()) {
            return byContactAndIsActive;
        }
        return Optional.empty();
    }

    @Override
    public List<EmployeeManagement> dynamicSearchWithMultipleFields(String searchKey) {
        return employeeManagementRepository.findAll(new Specification<EmployeeManagement>() {
            @Override
            public Predicate toPredicate(Root<EmployeeManagement> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();
                if (!StringUtils.isEmpty(searchKey)) {
                    predicates.add(criteriaBuilder.or(
                            criteriaBuilder.like(root.get("firstName"), "%" + searchKey + "%"),
                            criteriaBuilder.like(root.get("lastName"), "%" + searchKey + "%"),
                            criteriaBuilder.like(root.get("email"), "%" + searchKey + "%"),
                            criteriaBuilder.like(root.get("city"), "%" + searchKey + "%"),
                            criteriaBuilder.like(root.get("address"), "%" + searchKey + "%"))
                    );
                }
                return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        });
    }

    @Override
    public InputStreamResource getExcelTemplate(PhaseVo phaseVo) {
        InputStreamResource inputStreamResource = null;
        try {
            if(phaseVo.getPhase().equalsIgnoreCase("aamirKhan")) {
                inputStreamResource = new InputStreamResource(aamirKhanResource.getInputStream());
            }
            else {
                inputStreamResource = new InputStreamResource(salmanKhanResource.getInputStream());
            }
        } catch (Exception ex) {
            throw new RuntimeException("Something went wrong and file not downloaded");
        }
        return inputStreamResource;
    }


    public static void main(String[] args) throws Exception {


        System.out.println("Hello aamir khan !!!");
        printAamir("aamir");
        printAasim("aasim");
    }

    private static void printAasim(String aasim) {
        System.out.println(aasim);
    }

    private static void printAamir(String aamir) throws Exception {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
