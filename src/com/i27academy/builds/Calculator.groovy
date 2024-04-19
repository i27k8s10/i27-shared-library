package com.i27academy.builds;
class Calculator {
    def jenkins
    Calculator(jenkins) {
        this.jenkins = jenkins
    }

    // Methods
    def add(firstNumber, secondNumber) {
        // body 
        return firstNumber+secondNumber
    }

    def multiply(firstNumber, secondNumber) {
        // body 
        return firstNumber*secondNumber
    }
}