package com.employee.java8;


import com.employee.java8.Vo.ClientVO;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
//       Double d = 576564545675765867687687d;
//        BigInteger bigInteger = new BigInteger(String.valueOf(d));
//        BigDecimal b = new BigDecimal(d, MathContext.UNLIMITED);
//        DecimalFormat decimalFormat = new DecimalFormat("#");
////        decimalFormat.setMaximumFractionDigits(0);
//        ClientVO clientVO = new ClientVO();
////        clientVO.setfTsar(decimalFormat.format(d));
//        clientVO.setfTsar(String.valueOf(bigInteger));
//        System.out.println(clientVO.getfTsar());

        List<Employee> listEmployee = EmployeeMain.findListEmployee();
        System.out.println(listEmployee.size());
        if(Objects.nonNull(listEmployee)){
            System.out.println();
        }
        boolean anyMatch = listEmployee.stream().anyMatch(item -> "Aamir".equals(item.getName()));
        long count = listEmployee.stream().filter(Objects::isNull).count();
        System.out.println("count "+ count);
        System.out.println("any match " + anyMatch);


    }

    public static String removeDuplicateLetter(String name) {
        Set<Character> set = new LinkedHashSet<>();
        for (Character ch : name.toCharArray()) {
            set.add(ch);
        }
        StringBuilder st = new StringBuilder();
        for (Character ch : set) {
            st.append(ch);
        }

        return st.toString();
    }


}

