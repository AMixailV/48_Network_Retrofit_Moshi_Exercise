package ru.mixail_akulov.a48_network_retrofit_moshi_exercise.app.model.boxes.entities

enum class BoxesFilter {
    /**
     * Fetch all boxes, both active and inactive
     */
    ALL,

    /**
     * Fetch only active boxes
     */
    ONLY_ACTIVE
}