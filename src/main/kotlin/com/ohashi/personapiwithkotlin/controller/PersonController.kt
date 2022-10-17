package com.ohashi.personapiwithkotlin.controller

import com.ohashi.personapiwithkotlin.model.Person
import com.ohashi.personapiwithkotlin.service.PersonService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/person")
class PersonController(
    private val service: PersonService
) {

    @GetMapping("/{id}", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun findById(@PathVariable("id") id: Long) = service.findById(id)
}
