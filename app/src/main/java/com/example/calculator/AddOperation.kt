package com.example.calculator

// AddOperation
class AddOperator : Operator() {
    override fun calculate(num1: Double, num2: Double): Double = (num1 + num2)
}