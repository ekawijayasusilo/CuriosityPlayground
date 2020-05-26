package com.example.testapp

import org.junit.Assert.*
import org.junit.Test

class DummyParentClassTest{
    @Test
    fun test() {
        val mystring = "abrkaabcdefghijjxxx"
        val map = mutableMapOf<Char, MutableList<Int>>()

        mystring.forEachIndexed { index, c ->
            val list = map.getOrDefault(c, mutableListOf())
            list.add(index)
            map[c] = list
        }

        println(map)
    }
}