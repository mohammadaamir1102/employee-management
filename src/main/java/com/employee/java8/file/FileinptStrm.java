package com.employee.java8.file;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileinptStrm {

    public static void main(String[] args) {
        try {
            String name = "Hello Aamir How are you?";
            OutputStream outputStream = new FileOutputStream("C:\\files\\outPut.txt");
            byte[] bytes = name.getBytes();
            outputStream.write(bytes);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
