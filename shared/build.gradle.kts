plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {

    namespace = "org.sopt.multimodule_test.shared"
}

dependencies {
    // Material Design
    implementation(MaterialDesignDependencies.materialDesign)
}
