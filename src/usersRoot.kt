package com.devthoughts.info

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

private val userData = "{\"users\": [\"Nate\", \"Zane\", \"Nana\"]}"

fun Routing.users() {
    get("/users") {
        call.respondText(userData)
    }
}