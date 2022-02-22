package com.example.kmmdemo2

class Greeting {
    fun greeting(): String {
        return "world, ${Platform().platform}!"
    }
}