object GradlePluginVersion {
    const val androidGradle = "3.4.1"
    const val ktlintGradle = "8.1.0"
    const val detekt = "1.0.0-RC16"
    const val gradleVersionPlugin = "0.21.0"
}

object GradlePluginId {
    const val detekt = "io.gitlab.arturbosch.detekt"
    const val ktlintGradle = "org.jlleitschuh.gradle.ktlint"
    const val androidApplication = "com.android.application"
    const val androidFeature = "com.android.feature"
    const val androidLibrary = "com.android.library"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
    const val gradleVersionPlugin = "com.github.ben-manes.versions"
}

object GradleDependency {
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${CoreVersion.kotlin}"
    const val androidGradle = "com.android.tools.build:gradle:${GradlePluginVersion.androidGradle}"
    const val ktlintGradle = "org.jlleitschuh.gradle:ktlint-gradle:${GradlePluginVersion.ktlintGradle}"
}
