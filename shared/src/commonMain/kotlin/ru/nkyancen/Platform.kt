package ru.nkyancen

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform