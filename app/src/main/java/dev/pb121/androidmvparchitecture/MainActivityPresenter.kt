package dev.pb121.androidmvparchitecture

class MainActivityPresenter(
    private val mainActivityView: IMainActivityView
) : IMainActivityPresenter {

    private val mainActivityModel = MainActivityModel()

    override fun callModel() {
        val result = mainActivityModel.fakeApiCall()
        mainActivityView.showCounter(value = result)
    }
}