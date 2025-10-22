package com.vpdevs.streamkmp

class VideoPlayerEventHandler {
    companion object {
        var onPlayVideo: ((String) -> Unit)? = null
    }

    fun playVideo(url: String) {
        onPlayVideo?.invoke(url)
    }
}
