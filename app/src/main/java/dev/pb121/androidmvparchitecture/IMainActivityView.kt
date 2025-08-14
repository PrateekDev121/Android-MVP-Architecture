package dev.pb121.androidmvparchitecture

/**
 * IMainActivityView defines the contract for the view layer in MVP architecture.
 * It is responsible for displaying data to the user and reflecting any changes in the UI.
 */
interface IMainActivityView {
    fun showCounter(value: Int)
}