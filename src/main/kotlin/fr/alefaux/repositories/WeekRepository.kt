package fr.alefaux.repositories

import fr.alefaux.dto.Week
import fr.alefaux.models.Weeks
import fr.alefaux.repositories.interfaces.Repository
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.transactions.transaction
import java.util.*

class WeekRepository : Repository<Week> {
    override fun getAll(): List<Week> = transaction {
        return@transaction Weeks.selectAll().map { toWeek(it) }
    }

    override fun get(id: String): Week = transaction {
        return@transaction Weeks.select {
            (Weeks.id eq id)
        }.mapNotNull { toWeek(it) }
            .single()
    }

    override fun create(entity: Week): Week = transaction {
        val newId = UUID.randomUUID().toString()
        Weeks.insert {
            it[id] = newId
        }
        return@transaction get(newId)
    }

    override fun update(entity: Week): Week {
        TODO("Nothing to do for now")
    }

    override fun delete(id: String) {
        transaction {
            Weeks.deleteWhere { (Weeks.id eq id) }
        }
    }

    private fun toWeek(resultRow: ResultRow): Week {
        return Week(
            id = resultRow[Weeks.id]
        )
    }
}