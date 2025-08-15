package dev.pb121.androidmvparchitecture



/**
 * MainActivityPresenter as the Presenter layer of MVP architecture.
 * It implements the IMainActivityPresenter , the Presenter layer of MVP architecture.
 */
class MainActivityPresenter(
    private val mainActivityView: IMainActivityView
) : IMainActivityPresenter {

    private val mainActivityModel = MainActivityModel()

    override fun callModel() {
        val result = mainActivityModel.fakeApiCall()
        mainActivityView.showCounter(value = result)
    }
}