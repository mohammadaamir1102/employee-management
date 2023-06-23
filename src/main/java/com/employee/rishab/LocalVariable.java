package com.employee.rishab;

import com.employee.java8.Vo.ClientVO;

import java.util.ArrayList;
import java.util.List;

public class LocalVariable {

    static  int c = 76; // declare with static variable
    int d = 30; // initialization with instance variable

    int f;
    float i;
    boolean j;
    double k;
    long l;
    char m;

    Integer aaaa;
    Boolean bbb;
    public static void main(String[] args) {


        ClientVO clientVO = new ClientVO();
        List<String> list = new ArrayList<String>();
        list.add(clientVO.getfTsar());
        System.out.println(list);

        int a = 10; // local variable
        /* inside the method of body, inside the constructor, inside the blocks
        * */
        System.out.println(a);

        System.out.println(c);
        // is there any default value of local variable?
        LocalVariable localVariable = new LocalVariable();
        System.out.println(localVariable.d);

        System.out.println(localVariable.sum());
        System.out.println(localVariable.f);
        System.out.println(localVariable.i);
        System.out.println(localVariable.j);
        System.out.println(localVariable.k);
        System.out.println(localVariable.m);
        System.out.println(localVariable.aaaa);
        System.out.println(localVariable.bbb);

    }

    int sum(){
        return 10;
    }
}
