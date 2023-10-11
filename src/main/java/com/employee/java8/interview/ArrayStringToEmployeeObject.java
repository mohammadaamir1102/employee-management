package com.employee.java8.interview;

import java.util.ArrayList;
import java.util.List;

public class ArrayStringToEmployeeObject {

    public static void main(String[] args) {

     /*
     *
1|Ryan|M|100|Mumbai|1
2|Joanna|F|150|MUMBAI|2
Srno|Name|Gender|score|location|DepartmentID
3|Om|F|190|Pune|4
4|Krishna|M|180|Delhi|4
5|Ram|M|200|Jaipur|4
6|Radha|F|90|Indore|5
7|Om|M|80|Jaipur|5
8|Sita|F|125|Raipur|3
     * */

        String[] employeeArray = {"1|Ryan|M|100|Mumbai|1", "2|Joanna|F|150|MUMBAI|2"};

        List<EmployeeBean> employees = convertStringValueToObject(employeeArray);
        employees.forEach(System.out::println);
    }


    private static List<EmployeeBean> convertStringValueToObject(String[] employeeArray) {
        List<EmployeeBean> employeeList = new ArrayList<>();
        for (String value : employeeArray) {
            String[] parse = value.split("\\|");
            if (parse.length == 6) {

                EmployeeBean employeeBean = getEmployeeBean(parse);

                employeeList.add(employeeBean);
            }
        }
        return employeeList;
    }

    private static EmployeeBean getEmployeeBean(String[] parse) {
        String id = parse[0].trim();
        String name = parse[1].trim();
        String gender = parse[2].trim();
        String score = parse[3].trim();
        String location = parse[4].trim();
        String departmentId = parse[5].trim();

        //set the data to entity
        EmployeeBean employeeBean = new EmployeeBean();
        employeeBean.setSrno(id);
        employeeBean.setName(name);
        employeeBean.setGender(gender);
        employeeBean.setScore(score);
        employeeBean.setLocateion(location);
        employeeBean.setDepartmentId(departmentId);
        return employeeBean;
    }

}
