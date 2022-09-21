plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdk = BuildVersion.compileSdk
    buildToolsVersion = BuildVersion.buildTools

    defaultConfig {
        applicationId = "br.com.sailboat.money"
        minSdk = BuildVersion.minSdk
        targetSdk = BuildVersion.targetSdk
        versionCode = BuildVersion.versionCode
        versionName = BuildVersion.versionName
        vectorDrawables.useSupportLibrary = true
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            isDebuggable = false
        }
        getByName("debug") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            isDebuggable = true
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
        viewBinding = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.1"
    }
    packagingOptions {
        resources.excludes.add("/META-INF/{AL2.0,LGPL2.1}")
    }
}

dependencies {
    implementation(project(Module.transactionListImpl))

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.compose.ui:ui:1.2.1")
    implementation("androidx.compose.material:material:1.2.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.2.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")
    implementation("androidx.activity:activity-compose:1.5.1")
//    implementation(project(Hilt.android))
//    kapt(project(Hilt.android))

//    implementation "com.google.dagger:hilt-android:2.40.5"
//    kapt "com.google.dagger:hilt-android-compiler:2.40.5"
//    implementation "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"
//    kapt "androidx.hilt:hilt-compiler:1.0.0"
//    implementation 'androidx.hilt:hilt-navigation-compose:1.0.0'

    testImplementation(Junit.junit)
    testImplementation(MockK.core)
    testImplementation(Koin.test)
}
