package ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.utils

import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.ScrollView
import androidx.core.view.children
import androidx.core.view.isVisible
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.Success
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.Result
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.screens.base.BaseFragment
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.views.ResultView

fun <T> LiveData<T>.requireValue(): T {
    return this.value ?: throw IllegalStateException("Value is empty")
}

fun <T> LiveData<Result<T>>.observeResults(fragment: BaseFragment, root: View, resultView: ResultView, onSuccess: (T) -> Unit) {
    observe(fragment.viewLifecycleOwner) { result ->
        resultView.setResult(fragment, result)
        val rootView: View = if (root is ScrollView)
            root.getChildAt(0)
        else
            root

        if (rootView is ViewGroup && rootView !is RecyclerView && root !is AbsListView) {
            rootView.children
                .filter { it != resultView }
                .forEach {
                    it.isVisible = result is Success<*>
                }
        }
        if (result is Success) onSuccess.invoke(result.value)
    }
}

