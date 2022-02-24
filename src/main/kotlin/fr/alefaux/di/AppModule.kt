package fr.alefaux.di

import fr.alefaux.repositories.WeekRepository
import fr.alefaux.services.WeekService
import org.koin.dsl.module

val appModule = module {
    // Repositories
    single { WeekRepository() }

    // Services
    single { WeekService(get()) }
}