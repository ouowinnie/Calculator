package com.example.calculator

// SubstractOperation
class SubtractOperator : Operator() {
    override fun calculate(num1: Double, num2: Double): Double = (num1 - num2)
}