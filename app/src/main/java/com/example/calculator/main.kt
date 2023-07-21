package com.example.calculator

import android.media.VolumeShaper

fun main() {
    println("첫번째 숫자를 입력해주세요.")
    val num1 = readLine()!!.toDouble()
    println("연산자를 입력해주세요.")
    val operator = readLine()!!
    println("두번째 숫자를 입력해주세요.")
    val num2 = readLine()!!.toDouble()

    val selectedOperator = when (operator) {
        "+" -> AddOperator()
        "-" -> SubtractOperator()
        "*" -> MultiplyOperator()
        "/" -> DivideOperator()
        else -> { println("잘못된 연산자입니다.")
            return
        }
    }

    val calculate = Calc()
    val result = calculate.operation(selectedOperator, num1, num2)
    println("${num1} ${operator} ${num2}의 결과는: ${result}")
}



