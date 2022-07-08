//pluginManagement {
//    repositories {
//        gradlePluginPortal()
//        google()
//        mavenCentral()
//    }
//}
//dependencyResolutionManagement {
//    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
//    repositories {
//        google()
//        mavenCentral()
//    }
//}
rootProject.name = "multimodule-test"
include(":app")
include(":core")
include(":data")
include(":domain")
include(":navigator")
include(":shared")

// buildSrc는 빼야함
