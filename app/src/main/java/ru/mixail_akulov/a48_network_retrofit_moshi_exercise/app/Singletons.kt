package ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app

import android.content.Context
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.settings.SharedPreferencesAppSettings
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.SourcesProvider
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.accounts.AccountsRepository
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.accounts.AccountsSource
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.boxes.BoxesRepository
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.boxes.BoxesSource
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.settings.AppSettings
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.sources.SourceProviderHolder

object Singletons {

    private lateinit var appContext: Context

    private val sourcesProvider: SourcesProvider by lazy {
        SourceProviderHolder.sourcesProvider
    }

    val appSettings: AppSettings by lazy {
        SharedPreferencesAppSettings(appContext)
    }

    // --- sources

    private val accountsSource: AccountsSource by lazy {
        sourcesProvider.getAccountsSource()
    }

    private val boxesSource: BoxesSource by lazy {
        sourcesProvider.getBoxesSource()
    }

    // --- repositories

    val accountsRepository: AccountsRepository by lazy {
        AccountsRepository(
            accountsSource = accountsSource,
            appSettings = appSettings
        )
    }

    val boxesRepository: BoxesRepository by lazy {
        BoxesRepository(
            accountsRepository = accountsRepository,
            boxesSource = boxesSource
        )
    }

    /**
     * Call this method in all application components that may be created at app startup/restoring
     * (e.g. in onCreate of activities and services)
     */
    fun init(appContext: Context) {
        Singletons.appContext = appContext
    }
}

