package dev.albin.hello

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform