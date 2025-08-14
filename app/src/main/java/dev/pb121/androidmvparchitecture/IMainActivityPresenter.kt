package dev.pb121.androidmvparchitecture

/**
 * IMainActivityPresenter defines the contract for the Presenter layer in the MVP architecture.
 * It acts as the middle layer between the View (MainActivity) and the Model (MainActivityModel).
 */
interface IMainActivityPresenter {
    fun callModel()
}