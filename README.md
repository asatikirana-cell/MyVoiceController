# MyVoiceController v5.0

A comprehensive voice-controlled Android accessibility automation app with:
- Voice enrollment and verification
- Conversational voice commands
- Multi-step workflow execution
- Local security audit logging
- Personal wake-phrase calibration
- Optional neural speaker/wake-word models
- Privacy-first design (no cloud upload)

## Quick Start

1. Clone this repository
2. Open in Android Studio
3. Connect an Android phone (8.0+) with USB debugging enabled
4. Run → Run 'app'
5. Grant required permissions
6. Enable Accessibility Service in Settings
7. Enroll your voice (5 samples)
8. Try a command: "Go home", "Open Chrome", "Call [contact]"

## Build APK

```bash
# Using Android Studio UI:
Build → Build Bundle(s) / APK(s) → Build APK(s)

# Or using Gradle CLI:
./gradlew assembleDebug      # Debug APK
./gradlew assembleRelease    # Release APK (requires signing)
```

Generated APK will be at: `app/build/outputs/apk/debug/app-debug.apk`

## Install on Phone

```bash
adb install app/build/outputs/apk/debug/app-debug.apk
```

Or drag the APK file onto your connected Android phone.

## Permissions Required

- Microphone (RECORD_AUDIO)
- Contacts (READ_CONTACTS)
- Phone (CALL_PHONE)
- Notifications (POST_NOTIFICATIONS)
- Accessibility Service

## Features

### Voice Control
- Enroll 5 voice samples for speaker verification
- Make calls: "Call John"
- Send messages: "Text Sarah saying I'll be late"
- Open apps: "Open Chrome"
- Navigation: "Go home", "Go back", "Scroll down"
- Screen reading: "Read screen"

### Security
- Speaker verification with liveness detection
- Encrypted voice profile storage (AES-256-GCM)
- Encrypted audit log with integrity checking
- Device credential/biometric gate for critical actions
- Voice authorization tokens (short-lived)
- No raw recordings stored

### Advanced Features
- Always-ready microphone service (v3.0)
- Conversational sessions (v4.11)
- Multi-candidate disambiguation (v4.14)
- Personal wake-phrase calibration (v4.9)
- Optional neural speaker embedding (v3.5+)
- Optional neural wake-word detection (v4.7+)
- Task persistence across app restarts (v2.9)
- Workflow recovery with bounded retries (v2.8)

## System Requirements

- Android 8.0 (API 26) or higher
- 50 MB free storage
- Microphone hardware
- For neural models: compatible TensorFlow Lite models

## Privacy Policy

- **Local processing only**: all voice processing stays on your phone
- **No cloud upload**: no voice data, commands, or audit logs sent anywhere
- **Encrypted at rest**: profiles and audit logs use Android Keystore encryption
- **No internet permission**: declared in AndroidManifest.xml
- **No raw recording retention**: only acoustic embeddings (192-dimensional vectors) are stored

## Development

- **Language**: Kotlin
- **Min SDK**: 26 (Android 8.0)
- **Target SDK**: 35 (Android 15)
- **Build System**: Gradle with Kotlin DSL
- **Key Dependencies**:
  - androidx.core:core-ktx
  - androidx.appcompat:appcompat
  - com.google.mlkit:text-recognition (OCR)
  - androidx.biometric:biometric (BiometricPrompt)
  - org.tensorflow:tensorflow-lite (neural models)

## Known Limitations

- Speaker verification is probabilistic, not mathematically infallible
- Android OS may restrict microphone/Accessibility access based on system policies
- Neural models require compatible, licensed TensorFlow Lite models
- Background always-ready mode is subject to Android power management

## License

See LICENSE file for details.
