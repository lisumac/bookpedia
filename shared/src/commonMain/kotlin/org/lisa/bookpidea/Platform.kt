package org.lisa.bookpidea

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform