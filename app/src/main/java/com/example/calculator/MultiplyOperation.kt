package com.example.calculator

// MultiplyOperation
class MultiplyOperator : Operator() {
    override fun calculate(num1: Double, num2: Double): Double = (num1 * num2)
    override fun matches(operator: String): Boolean = (operator == "*")
}