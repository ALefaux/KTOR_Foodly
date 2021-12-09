package fr.alefaux.plugins

import fr.alefaux.models.Weeks
import io.ktor.application.*
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

fun Application.configureDatabase() {
    val dataSource = DataSource.devDataSource()
    Database.connect(dataSource)

    transaction {
        SchemaUtils.create(Weeks)
    }
}