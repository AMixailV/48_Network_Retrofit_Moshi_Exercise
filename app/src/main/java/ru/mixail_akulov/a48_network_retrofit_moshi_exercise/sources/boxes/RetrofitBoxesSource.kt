package ru.mixail_akulov.a48_network_retrofit_moshi_exercise.sources.boxes

import kotlinx.coroutines.delay
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.boxes.BoxesSource
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.boxes.entities.BoxAndSettings
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.boxes.entities.BoxesFilter
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.sources.base.BaseRetrofitSource
import ru.mixail_akulov.a48_network_retrofit_moshi_exercise.sources.base.RetrofitConfig

// todo #8: implement BoxesSource methods:
//          - setIsActive() -> should call 'PUT '/boxes/{boxId}'
//          - getBoxes() -> should call 'GET /boxes[?active=true|false]'
//                          and return the list of BoxAndSettings entities
class RetrofitBoxesSource(
    config: RetrofitConfig
) : BaseRetrofitSource(config), BoxesSource {

    override suspend fun setIsActive(
        boxId: Long,
        isActive: Boolean
    ) {
        TODO()
    }

    override suspend fun getBoxes(
        boxesFilter: BoxesFilter
    ): List<BoxAndSettings> = wrapRetrofitExceptions {
        delay(500)
        TODO()
    }

}