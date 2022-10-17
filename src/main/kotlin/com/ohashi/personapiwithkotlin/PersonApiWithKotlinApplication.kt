package com.ohashi.personapiwithkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PersonApiWithKotlinApplication

fun main(args: Array<String>) {
	runApplication<PersonApiWithKotlinApplication>(*args)
}
