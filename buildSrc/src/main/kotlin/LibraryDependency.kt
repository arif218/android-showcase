private object LibraryVersion {
    //core
    const val kodein = "5.2.0"
    const val fuel = "1.16.0"
    const val gson = "2.8.3"
    const val timber = "4.7.1"
    const val appCompact = "1.0.2"
    const val recyclerView = "1.0.0"
    const val coordinatorLayout = "1.0.0"
    const val material = "1.0.0"
    const val constraintLayout = "1.1.3"
    const val coroutinesAndroid = "1.0.1"
    const val lifecycle = "1.1.1"
    const val coreKtx = "1.0.1"
    const val fragmentKtx = "1.0.0"
    const val lifecycleViewModelKtx = "2.0.0"
    const val picasso = "2.71828"
    const val customFloatingActionButton = "2.1.1"

    //test
    const val junit = "4.12"
    const val kluent = "1.43"
    const val testRunner = "1.0.2"
    const val espressoCore = "3.0.2"
    const val mockito = "2.23.4"
    const val mockitoKotlin = "2.0.0"
}

object LibraryDependency {
    //core
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${CoreVersion.kotlin}"
    const val kodein = "org.kodein.di:kodein-di-generic-jvm:${LibraryVersion.kodein}"
    const val kodeinAndroid = "org.kodein.di:kodein-di-framework-android-support:${LibraryVersion.kodein}"
    const val fuelAndroid = "com.github.kittinunf.fuel:fuel-android:${LibraryVersion.fuel}"
    const val fuelGson = "com.github.kittinunf.fuel:fuel-gson:${LibraryVersion.fuel}"
    const val fuelCoroutines = "com.github.kittinunf.fuel:fuel-coroutines:${LibraryVersion.fuel}"
    const val gson = "com.google.code.gson:gson:${LibraryVersion.gson}"
    const val timber = "com.jakewharton.timber:timber:${LibraryVersion.timber}"
    const val supportConstraintLayout = "androidx.constraintlayout:constraintlayout:${LibraryVersion.constraintLayout}"
    const val appCompact = "androidx.appcompat:appcompat:${LibraryVersion.appCompact}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${LibraryVersion.recyclerView}"
    const val coordinatorLayout = "androidx.coordinatorlayout:coordinatorlayout:${LibraryVersion.coordinatorLayout}"
    const val supportMaterial = "com.google.android.material:material:${LibraryVersion.material}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${LibraryVersion.coroutinesAndroid}"
    const val lifecycleExtensions = "android.arch.lifecycle:extensions:${LibraryVersion.lifecycle}"
    const val lifecycleCompiler = "android.arch.lifecycle:compiler:${LibraryVersion.lifecycle}"
    const val coreKtx = "androidx.core:core-ktx:${LibraryVersion.coreKtx}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${LibraryVersion.fragmentKtx}"
    const val lifecycleViewModelKtx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${LibraryVersion.lifecycleViewModelKtx}"
    const val picasso = "com.squareup.picasso:picasso:${LibraryVersion.picasso}"
    const val customFloatingActionButton =
        "com.robertlevonyan.view:CustomFloatingActionButton:${LibraryVersion.customFloatingActionButton}"

    //test
    const val junit = "junit:junit:${LibraryVersion.junit}"
    const val kluent = "org.amshove.kluent:kluent:${LibraryVersion.kluent}"
    const val testRunner = "com.android.support.test:runner:${LibraryVersion.testRunner}"
    const val espressoCore = "com.android.support.test.espresso:espresso-core:${LibraryVersion.espressoCore}"
    const val kluentAndroid = "org.amshove.kluent:kluent-android:${LibraryVersion.kluent}"
    const val mockitoInline = "org.mockito:mockito-inline:${LibraryVersion.mockito}"
    const val mockitoAndroid = "org.mockito:mockito-android:${LibraryVersion.mockito}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${LibraryVersion.mockitoKotlin}"
}
