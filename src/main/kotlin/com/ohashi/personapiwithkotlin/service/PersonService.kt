package com.ohashi.personapiwithkotlin.service

import com.ohashi.personapiwithkotlin.model.Person
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger

@Service
class PersonService {

    private val counter: AtomicLong = AtomicLong()

    fun findById(id: Long): Person {
        logger.info { "Find a person with id=$id" }

        val person = Person()

        person.id = counter.incrementAndGet()
        person.firstName = "Leonardo"
        person.lastName = "Ohashi"
        person.address = "São Paulo"
        person.gender = "Male"

        return person
    }

    companion object {
        val logger = Logger.getLogger(PersonService::class.java.name)
    }
}
