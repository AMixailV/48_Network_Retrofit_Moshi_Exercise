package ru.mixail_akulov.a48_network_retrofit_moshi_exercise.sources.base

import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.SourcesProvider
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.accounts.AccountsSource
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.boxes.BoxesSource

// todo #9: create AccountsSource and BoxesSource.
class RetrofitSourcesProvider(
    private val config: RetrofitConfig
) : SourcesProvider {

    override fun getAccountsSource(): AccountsSource {
        TODO()
    }

    override fun getBoxesSource(): BoxesSource {
        TODO()
    }

}