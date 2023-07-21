package com.example.calculator

// DivideOperation
class DivideOperator : Operator() {
    override fun calculate(num1: Double, num2: Double): Double = (num1 / num2)
}