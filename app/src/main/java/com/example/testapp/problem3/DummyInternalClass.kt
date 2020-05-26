package com.example.testapp.problem3

// This class should not be named DummyInternalClassKt
internal class DummyInternalClass {
    // internal method and property accessor are set to public
    // and given unusual names to prevent accidental access from Java file that's not in the same module
    internal var dummyInternalProperty = "dummyInternalProperty"
    internal fun dummyInternalMethod() {
        println("dummyMethod")
    }

    // synthetic methods for accessing private method and variable are generated in the generated wrapper Kotlin class
    init {
        dummyInternalProperty = dummyTopLevelVariable
        dummyTopLevelMethod()
    }
}

// These methods and variable will be placed on separate, generated class, namely DummyInternalClasskt
private fun DummyInternalClass.dummyExtensionMethod() {
    println(dummyInternalProperty)
}
private val dummyTopLevelVariable = "dummyTopLevelVariable"
private fun dummyTopLevelMethod() {
    println(dummyTopLevelVariable)
}

sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}
