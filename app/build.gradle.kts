plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.myvoice.controller"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.myvoice.controller"
        minSdk = 26
        targetSdk = 35
        versionCode = 100
        versionName = "5.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("com.google.mlkit:text-recognition:16.0.1")
    implementation("androidx.activity:activity-ktx:1.10.0")
    implementation("androidx.biometric:biometric:1.1.0")
    implementation("org.tensorflow:tensorflow-lite:2.14.0")
}
