package ru.mixail_akulov.a48_network_retrofit_moshi_exercise.sources.accounts.entities

/**
 * Request body for `POST /sign-in` HTTP-request.
 *
 * JSON example:
 * ```
 * {
 *   "email": "",
 *   "password": "",
 * }
 * ```
 */
data class SignInRequestEntity(
    val email: String,
    val password: String
)