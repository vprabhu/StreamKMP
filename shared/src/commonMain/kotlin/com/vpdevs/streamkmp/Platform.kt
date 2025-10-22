package com.vpdevs.streamkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform