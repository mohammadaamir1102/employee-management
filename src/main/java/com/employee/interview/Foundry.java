package com.employee.interview;

import java.io.IOException;

class San {
    San() throws IOException {

    }

}

class Foundry extends San {
    Foundry() throws IOException { // if I'll not use throws IOException, got CTE
    }
    public static void main(String[] args) {

    }
}

/*
a) compile time error
b) run time error
c) compile and runs fine
d) unreported exception java.io.IOException in default constructor
*
*
* */