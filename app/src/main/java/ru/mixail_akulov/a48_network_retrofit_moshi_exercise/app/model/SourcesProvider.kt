package ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model

import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.accounts.AccountsSource
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.boxes.BoxesSource

/**
 * Factory class for all network sources.
 */
interface SourcesProvider {

    /**
     * Create [AccountsSource] which is responsible for reading/writing
     * user accounts data.
     */
    fun getAccountsSource(): AccountsSource

    /**
     * Create [BoxesSource] which is responsible for reading/updating
     * boxes data.
     */
    fun getBoxesSource(): BoxesSource

}