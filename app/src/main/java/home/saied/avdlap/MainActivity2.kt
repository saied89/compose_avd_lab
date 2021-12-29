package home.saied.avdlap

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.graphics.ExperimentalAnimationGraphicsApi
import androidx.compose.animation.graphics.res.animatedVectorResource
import androidx.compose.animation.graphics.res.rememberAnimatedVectorPainter
import androidx.compose.animation.graphics.vector.AnimatedImageVector
import androidx.compose.foundation.interaction.FocusInteraction
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import home.saied.avdlap.ui.theme.AVDLapTheme
import kotlinx.coroutines.launch

class MainActivity2 : ComponentActivity() {
    @OptIn(ExperimentalAnimationGraphicsApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            AVDLapTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val image =
                        AnimatedImageVector.animatedVectorResource(R.drawable.asl_trimclip_searchback)
                    val atEnd = false
                    IconButton(onClick = {
//                        if (homeState == HomeState.SEARCH)
//                            focusManager.clearFocus()
//                        else
//                            scope.launch{
//                                searchBoxInteractionSource.emit(FocusInteraction.Focus())
//                            }
                    }) {
                        Icon(
                            painter = rememberAnimatedVectorPainter(image, atEnd),
                            contentDescription = null
                        )
                    }
                }
            }
//        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AVDLapTheme {
        Greeting("Android")
    }
}