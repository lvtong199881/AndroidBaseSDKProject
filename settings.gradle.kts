pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id("com.android.library") version "8.2.0"
        id("org.jetbrains.kotlin.android") version "2.2.10"
        id("com.facebook.react") version "0.76.9"
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
    }
}

// 基础组件模块
include(":startup")
include(":router")
include(":network")
include(":logger")
include(":base")
include(":reactnative")
include(":websdk")

rootProject.name = "AndroidBaseSDK"
