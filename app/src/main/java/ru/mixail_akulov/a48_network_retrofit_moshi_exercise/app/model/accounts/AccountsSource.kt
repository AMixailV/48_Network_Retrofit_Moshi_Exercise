package ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.accounts

import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.BackendException
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.ConnectionException
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.ParseBackendResponseException
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.accounts.entities.Account
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.accounts.entities.SignUpData

interface AccountsSource {

    /**
     * Execute sign-in request.
     * @throws ConnectionException
     * @throws BackendException
     * @throws ParseBackendResponseException
     * @return JWT-token
     */
    suspend fun signIn(email: String, password: String): String

    /**
     * Create a new account.
     * @throws ConnectionException
     * @throws BackendException
     * @throws ParseBackendResponseException
     */
    suspend fun signUp(signUpData: SignUpData)

    /**
     * Get the account info of the current signed-in user.
     * @throws ConnectionException
     * @throws BackendException
     * @throws ParseBackendResponseException
     */
    suspend fun getAccount(): Account

    /**
     * Change the username of the current signed-in user.
     * @throws ConnectionException
     * @throws BackendException
     * @throws ParseBackendResponseException
     */
    suspend fun setUsername(username: String)

}