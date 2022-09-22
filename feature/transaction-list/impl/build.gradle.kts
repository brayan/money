plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {
    compileSdk = BuildVersion.compileSdk

    defaultConfig {
        minSdk = BuildVersion.minSdk
        targetSdk = BuildVersion.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
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
        viewBinding = true
    }
}

dependencies {
    implementation(project(Module.transactionListPublic))

    implementation(Coroutines.core)
    implementation(Coroutines.android)
    implementation(Lifecycle.viewModel)
    implementation(Lifecycle.runtime)
    implementation(Lifecycle.liveData)
    implementation(Koin.android)
    implementation(AndroidX.appcompat)
    implementation(AndroidX.recyclerview)
    implementation(AndroidX.constraintLayout)
    implementation(AndroidX.materialDesign)
    implementation(AndroidX.ktx)

    implementation(Compose.ui)
    implementation(Compose.material)
    implementation(Compose.uiToolingPreview)
    implementation(Compose.lifecycleRuntimeKtx)
    implementation(Compose.activity)

    implementation(Hilt.android)
    implementation(Hilt.navigationCompose)
    implementation(Hilt.lifecycleViewModel)
    kapt(Hilt.androidCompiler)
    kapt(Hilt.compiler)

    testImplementation(Junit.junit)
    testImplementation(MockK.core)
    testImplementation(Kotlin.test)
    testImplementation(Coroutines.test)
    testImplementation(Lifecycle.test)

    androidTestImplementation(MockK.android)
    androidTestImplementation(AndroidXTest.espresso)
    androidTestImplementation(AndroidXTest.runner)
    androidTestImplementation(AndroidXTest.rules)
}
