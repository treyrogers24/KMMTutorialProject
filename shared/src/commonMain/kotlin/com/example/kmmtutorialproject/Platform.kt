package com.example.kmmtutorialproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform