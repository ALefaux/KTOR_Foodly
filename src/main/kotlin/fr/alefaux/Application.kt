package fr.alefaux

import fr.alefaux.di.appModule
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import fr.alefaux.plugins.*
import org.koin.core.context.startKoin
import org.koin.logger.slf4jLogger

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureMonitoring()
        configureRouting()
        configureDatabase()

        startKoin {
            slf4jLogger()
            modules(appModule)
        }
    }.start(wait = true)
}
