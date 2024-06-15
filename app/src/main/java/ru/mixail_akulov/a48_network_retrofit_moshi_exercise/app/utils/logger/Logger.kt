package ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.utils.logger

interface Logger {

    fun log(tag: String, message: String)

    fun error(tag: String, e: Throwable)

}