package com.employee.java8;

interface TVRemoteFunctionalInterface{
    void switchOn();
}
public class TVRemoteFunctionalInterfaceMain{
    public static void main(String[] args) {
      /*
      TVRemoteFunctionalInterface tvRemoteFunctionalInterface = new TVRemoteFunctionalInterface() {
            @Override
            public void switchOn() {
                System.out.println("traditional way");
            }
        };
       tvRemoteFunctionalInterface.switchOn();

       */

        TVRemoteFunctionalInterface tvRemoteFunctionalInterface =
                ()-> System.out.println("Latest way");
        tvRemoteFunctionalInterface.switchOn();
    }

}
