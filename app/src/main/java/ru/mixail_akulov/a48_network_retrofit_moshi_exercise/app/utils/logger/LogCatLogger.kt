package ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.utils.logger

import android.util.Log

object LogCatLogger : Logger {

    override fun log(tag: String, message: String) {
        Log.d(tag, message)
    }

    override fun error(tag: String, e: Throwable) {
        Log.e(tag, "Error!", e)
    }

}