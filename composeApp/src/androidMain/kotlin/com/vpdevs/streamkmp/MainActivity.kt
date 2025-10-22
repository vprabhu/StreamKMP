package com.vpdevs.streamkmp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        init(
            context = this@MainActivity
        )
        setContent {
            App()
        }
    }
}

private fun init(context: Context) {
    VideoPlayerEventHandler.onPlayVideo = { url ->
        streamAndPLayVideo(context, url) // This is your app's native function
    }
}

fun streamAndPLayVideo(context: Context, url: String) {
    val intent = Intent(context, VideoPlayerActivity::class.java)
    intent.putExtra("VIDEO_URL", url)
    context.startActivity(intent)
}


@Preview
@Composable
fun AppAndroidPreview() {
    App()
}