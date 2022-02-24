package fr.alefaux.services

import fr.alefaux.dto.Week
import fr.alefaux.repositories.WeekRepository
import fr.alefaux.services.interfaces.Service

class WeekService(weekRepository: WeekRepository): Service<Week>(weekRepository)