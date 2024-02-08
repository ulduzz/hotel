object Versions{
    const val androidApplication = "8.2.0"
    const val jetBrainsKotlinAndroid = "1.9.10"
    const val materialComponents = "1.11.0"

    const val hilt = "2.47"
    const val navigation = "2.7.6"

    const val retrofit = "2.9.0"
    const val okhttpLog = "4.10.0"
    const val okhttp = "5.0.0-alpha.3"
    const val gson = "2.10.1"
}

object Libs{
 object UI{
     const val material = "com.google.android.material:material:${Versions.materialComponents}"
 }

    object Hilt {
        const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltKapt = "com.google.dagger:hilt-compiler:${Versions.hilt}"
    }
    object Navigation {
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    }
    object API {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLog}"
        const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
        const val gson = "com.google.code.gson:gson:${Versions.gson}"
    }
}

object Plugins{
      const val androidApplication ="com.android.application"
      const val jetBrainsKotlin = "org.jetbrains.kotlin.android"
      const val hilt = "dagger.hilt.android.plugin"
      const val kotlinKapt = "kotlin-kapt"
      const val parcelize = "kotlin-parcelize"
}
object Classpath {
    const val hilt = "com.google.dagger.hilt.android"
}
