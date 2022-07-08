plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "org.sopt.multimodule_test.navigator"
}

dependencies {

    // Android Core
    implementation(AndroidXDependencies.coreKtx)

//    // test
//    implementation(AndroidXDependencies.junit)
//    androidTestImplementation(TestDependencies.androidTest)
}
