package com.example.kmmdemo2

class Greeting {
    fun greeting(): String {
        return "跨端技术哪家强, ${Platform().platform}!"
    }
}