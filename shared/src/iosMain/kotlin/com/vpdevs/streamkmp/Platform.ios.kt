package com.vpdevs.streamkmp

import platform.AVFoundation.AVPlayer
import platform.AVFoundation.play
import platform.AVKit.AVPlayerViewController
import platform.Foundation.NSURL
import platform.UIKit.UIApplication


actual fun playVideo(url: String) {

    val nsUrl = NSURL.URLWithString(url)
    val player = AVPlayer.playerWithURL(nsUrl!!)
    val playerViewController = AVPlayerViewController()
    playerViewController.player = player

    // You need access to the current UIViewController.
    // Often you'd pass it in via context or expect/actual, but here's a classic hack:
    val rootVC = UIApplication.sharedApplication.keyWindow?.rootViewController
    rootVC?.presentViewController(playerViewController, animated = true, completion = null)

    player.play()

}