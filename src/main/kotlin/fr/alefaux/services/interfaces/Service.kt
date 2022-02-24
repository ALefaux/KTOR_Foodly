package fr.alefaux.services.interfaces

import fr.alefaux.dto.interfaces.Model
import fr.alefaux.repositories.interfaces.Repository

open class Service<T: Model>(private val repository: Repository<T>) {
    open fun getAll(): List<T> = repository.getAll()
    open fun get(id: String): T = repository.get(id)
    open fun create(entity: T): T = repository.create(entity)
    open fun update(entity: T): T = repository.update(entity)
    open fun delete(id: String) = repository.delete(id)
}