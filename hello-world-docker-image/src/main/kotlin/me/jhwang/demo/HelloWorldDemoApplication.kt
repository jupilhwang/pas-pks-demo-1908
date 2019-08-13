package me.jhwang.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class HelloWorldDemoApplication

fun main(args: Array<String>) {
    runApplication<HelloWorldDemoApplication>(*args)
}

@RestController
@RequestMapping("/")
class HelloWorld    {
    @GetMapping("/{name}")
    fun greeting(@PathVariable name: String)  = "Hello World !!!! $name"
}