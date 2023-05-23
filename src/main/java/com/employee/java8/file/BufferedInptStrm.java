package com.employee.java8.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInptStrm {
    public static void main(String[] args) throws IOException {
        BufferedInputStream br = new BufferedInputStream(new FileInputStream("C:\\files\\outPut.txt"));
        int value = br.read();
        System.out.print("Content here = ");
        while (value != -1) {
            System.out.print((char) value);
            value = br.read();
        }

    }
}
