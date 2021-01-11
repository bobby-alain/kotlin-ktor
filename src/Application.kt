package com.devthoughts.info

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

private val userData = "{\"users\": [\"Nate\", \"Zane\", \"Nana\"]}"

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    routing {
        get("/" ) {
            call.respondText("Hello world", ContentType.Text.Plain)
        }
        post("/") {
            val post = call.receive<String>()
            call.respondText ("Received $post from the post body", ContentType.Text.Plain)
        }
        get("/users") {
            call.respondText(userData)
        }
    }
}

