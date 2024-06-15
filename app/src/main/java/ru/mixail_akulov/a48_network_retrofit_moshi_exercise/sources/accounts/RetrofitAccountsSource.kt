package ru.mixail_akulov.a48_network_retrofit_moshi_exercise.sources.accounts

import kotlinx.coroutines.delay
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.accounts.AccountsSource
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.accounts.entities.Account
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.accounts.entities.SignUpData
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.sources.base.BaseRetrofitSource
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.sources.base.RetrofitConfig

// todo #7: implement AccountSource methods:
//          - signIn -> should call 'POST /sign-in' and return a token
//          - signUp -> should call ' POST /sign-up'
//          - getAccount -> should call 'GET /me' and return account data
//          - setUsername -> should call 'PUT /me'
class RetrofitAccountsSource(
    config: RetrofitConfig
) : BaseRetrofitSource(config), AccountsSource {

    override suspend fun signIn(
        email: String,
        password: String
    ): String {
        delay(1000)
        TODO()
    }

    override suspend fun signUp(
        signUpData: SignUpData
    ) {
        delay(1000)
        TODO()
    }

    override suspend fun getAccount(): Account {
        delay(1000)
        TODO()
    }

    override suspend fun setUsername(
        username: String
    ) {
        delay(1000)
        TODO()
    }

}