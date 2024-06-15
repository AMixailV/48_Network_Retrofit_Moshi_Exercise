package ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.settings

interface AppSettings {

    /**
     * Get auth token of the current logged-in user.
     */
    fun getCurrentToken(): String?

    /**
     * Set auth token of the logged-in user.
     */
    fun setCurrentToken(token: String?)

}
