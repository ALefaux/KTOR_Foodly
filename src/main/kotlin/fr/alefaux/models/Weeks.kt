package fr.alefaux.models

import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object Weeks: Table(name = "week_table") {
    val id: Column<String> = varchar("id", 36).primaryKey()
}