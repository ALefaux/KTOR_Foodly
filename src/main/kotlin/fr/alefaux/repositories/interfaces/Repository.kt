package fr.alefaux.repositories.interfaces

import fr.alefaux.dto.interfaces.Model

interface Repository<T: Model> {
    fun getAll(): List<T>
    fun get(id: String): T
    fun create(entity: T): T
    fun update(entity: T): T
    fun delete(id: String)
}