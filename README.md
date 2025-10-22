# StreamKMP 🎬

> Cross-platform video streaming player built with Kotlin Multiplatform

A modern, cross-platform video player that demonstrates the power of Kotlin Multiplatform (KMP) by sharing business logic while delivering native performance on both Android and iOS.

## ✨ Features

- 🎯 **Cross-Platform**: Single codebase for Android and iOS
- 📱 **Native Performance**: ExoPlayer on Android, AVPlayer on iOS
- 🏗️ **Clean Architecture**: Expect/Actual pattern for platform abstraction
- 🚀 **Modern Stack**: Kotlin Multiplatform, Jetpack Compose, SwiftUI

## 🛠️ Tech Stack

### Shared (Kotlin Multiplatform)
- **Kotlin Multiplatform** - Business logic sharing
- **Expect/Actual** - Platform-specific implementations

### Android
- **ExoPlayer (Media3)** - Video playback engine
- **Jetpack Compose** - Modern Android UI
- **AppCompat** - Material theming

### iOS
- **AVPlayer** - Native iOS video playback
- **SwiftUI** - Modern iOS UI
- **UIKit Interop** - AVPlayerViewController integration

## 🏃‍♂️ Quick Start

### Prerequisites
- Android Studio Arctic Fox or later
- Xcode 13+ (for iOS development)
- JDK 11+

### Clone & Run
git clone https://github.com/vprabhu/StreamKMP.git
cd StreamKMP

#### Android
./gradlew :composeApp:installDebug

#### iOS
cd iosApp
xed .
Open `iosApp.xcodeproj` and run from Xcode. You may need to select a development team for signing.

## 🏗️ Architecture

StreamKMP follows a clean multiplatform architecture:

shared/
├── commonMain/ # Shared business logic
│ └── Platform.kt # expect fun playVideo()
├── androidMain/ # Android-specific code
│ └── Platform.kt # actual fun playVideo() - ExoPlayer
└── iosMain/ # iOS-specific code
└── Platform.kt # actual fun playVideo() - AVPlayer

composeApp/ # Android app
└── VideoPlayerActivity # ExoPlayer integration

iosApp/ # iOS app
└── ContentView.swift # SwiftUI + AVPlayer


### Key Design Decisions

- **Expect/Actual Pattern**: Clean separation between shared contracts and platform implementations
- **Platform-Specific UI**: Native video players for optimal performance
- **Event-Driven**: Shared code triggers events, platforms handle UI

## 🎯 Demo

Currently plays Big Buck Bunny demo video to showcase cross-platform functionality.

### Screenshots
> Screenshots will be added after rebuild

### Demo Videos
> Demo videos will be added after rebuild

## 🗺️ Roadmap

### v1.1 - Media Controls
- [ ] Play/Pause controls
- [ ] Seek bar
- [ ] Volume control
- [ ] Fullscreen mode

### v1.2 - Smart Streaming
- [ ] Adaptive bitrate streaming
- [ ] Network speed detection
- [ ] Quality selection

### v1.3 - Playlist Support
- [ ] Multiple video URLs
- [ ] Next/Previous navigation
- [ ] Playlist management

### v1.4 - UI Polish
- [ ] Custom player skin
- [ ] Loading states
- [ ] Error handling
- [ ] Better responsive design

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- [Big Buck Bunny](https://peach.blender.org/) - Demo video content
- [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html) - Cross-platform framework
- [ExoPlayer](https://exoplayer.dev/) - Android video playback
- [AVPlayer](https://developer.apple.com/documentation/avfoundation/avplayer) - iOS video playback

---

Built with ❤️ using Kotlin Multiplatform

**[⭐ Star this repo](https://github.com/vprabhu/StreamKMP)** | **[🐛 Report Bug](https://github.com/vprabhu/StreamKMP/issues)** | **[✨ Request Feature](https://github.com/vprabhu/StreamKMP/issues)**

