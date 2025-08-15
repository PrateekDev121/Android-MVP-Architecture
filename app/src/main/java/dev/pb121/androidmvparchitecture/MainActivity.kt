package dev.pb121.androidmvparchitecture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.pb121.androidmvparchitecture.ui.theme.AndroidMVPArchitectureTheme

/**
 * MainActivity as the View layer of MVP architecture.
 * It implements the IMainActivityView , the view layer of MVP architecture.
 */
class MainActivity : ComponentActivity(), IMainActivityView {

    private val mainActivityPresenter:IMainActivityPresenter = MainActivityPresenter(
        mainActivityView = this@MainActivity,
    )
    private val counter = mutableIntStateOf(0)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidMVPArchitectureTheme {
                Scaffold(modifier = Modifier.Companion.fillMaxSize()) { innerPadding ->
                    MainActivityView(
                        modifier = Modifier.Companion
                            .fillMaxSize()
                            .padding(innerPadding),
                        counter = counter.intValue.toString(),
                        onClick = { mainActivityPresenter.callModel() }
                    )
                }
            }
        }
    }

    override fun showCounter(value: Int) {
        counter.intValue = value
    }
}

@Composable
private fun MainActivityView(
    modifier: Modifier,
    counter: String,
    onClick: () -> Unit
) {

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(onClick = onClick) {
            Text(text = "Call Fake API")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = counter)
    }

}