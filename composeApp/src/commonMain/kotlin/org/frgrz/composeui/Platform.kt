package org.frgrz.composeui

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform