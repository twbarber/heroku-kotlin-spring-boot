package me.twbarber.heroku

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class Application {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(Application::class.java, *args)
        }
    }

}

@RestController
class HelloController {

    @GetMapping("/")
    fun hello() : String {
        return "Hello, Heroku + Kotlin!"
    }

    @GetMapping("/{name}")
    fun helloName(@PathVariable name: String) : String {
        return "Hello, $name!"
    }

}