package fr.alefaux

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import fr.alefaux.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureMonitoring()
        configureRouting()
        configureDatabase()
    }.start(wait = true)
}
