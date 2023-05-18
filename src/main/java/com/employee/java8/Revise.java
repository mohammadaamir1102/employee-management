package com.employee.java8;

import com.employee.java8.Vo.ClientVO;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public  class  Revise  {

    public static void main(String[] args) {
    String relationShip = null;
        ClientVO clientVO = new ClientVO();
        clientVO.setfTsar(Revise.nullSafe(relationShip));
        System.out.println(clientVO.getfTsar());

    }
    public static String nullSafe(Object nullSafe){
        return StringUtils.trimWhitespace(Objects.toString(nullSafe, ""));
    }
}
