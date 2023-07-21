package com.example.calculator

// AbstractOperation : 추상화
abstract class Operator {
    abstract fun calculate(num1: Double, num2: Double): Double
    abstract fun matches(operator: String): Boolean
}