package dev.pb121.androidmvparchitecture

import kotlin.ranges.random

/**
 * MainActivityModel represents the Model layer in the MVP architecture.
 * It contains the business logic and handles data-related operations.
 * It don't know anything about the View or Presenter layer.
 */
class MainActivityModel {

    fun fakeApiCall():Int{
        return (1..10).random()
    }
}