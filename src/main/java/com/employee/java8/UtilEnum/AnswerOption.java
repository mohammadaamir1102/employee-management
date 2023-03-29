package com.employee.java8.UtilEnum;

import java.util.Arrays;
import java.util.Optional;

public enum AnswerOption {

    Y("Yes"),
    N("No"),
    I("Incomplete");

    private String answerOption;

    AnswerOption(String answerOption) {
        this.answerOption = answerOption;
    }

    public String getAnswerOption() {
        return answerOption;
    }

    public void setAnswerOption(String answerOption) {
        this.answerOption = answerOption;
    }

    public static Optional<AnswerOption> getByValue(String value) {
        return Arrays.asList(values()).stream()
                .filter(v -> v.getAnswerOption().equalsIgnoreCase(value)).findAny();
    }

    public static void main(String[] args) {
        Optional<AnswerOption> supportAnswer = AnswerOption.getByValue("Yes");
        if (AnswerOption.Y.name().equals(supportAnswer.map(AnswerOption::name).orElse(AnswerOption.N.name()))) {
            System.out.println("if block");
        }
    }
}
