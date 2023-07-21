package com.example.calculator

// Calculator
class Calc() {
    fun operation(operator: Operator, num1: Double, num2: Double): Double = operator.calculate(num1, num2)
}