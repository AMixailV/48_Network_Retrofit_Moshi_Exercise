package ru.mixail_akulov.a48_network_retrofit_moshi_exercise.sources.base

import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.BackendException
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.ConnectionException
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.ParseBackendResponseException

// todo #4: добавьте свойство для доступа к экземпляру Retrofit
//  и реализуйте метод WrapRetrofitExceptions().
open class BaseRetrofitSource(
    retrofitConfig: RetrofitConfig
) {

    /**
     * Map network and parse exceptions into in-app exceptions.
     * @throws BackendException
     * @throws ParseBackendResponseException
     * @throws ConnectionException
     */
    suspend fun <T> wrapRetrofitExceptions(block: suspend () -> T): T {
        // execute 'block' passed to arguments and throw:
        // - BackendException with code and message if server has returned error response
        // - ParseBackendResponseException if server response can't be parsed
        // - ConnectionException if HTTP request has failed
        TODO()
    }

}