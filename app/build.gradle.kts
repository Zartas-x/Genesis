plugins { id("com.android.application"); id("org.jetbrains.kotlin.android") }
android {
    namespace = "com.zartas.genesis"; compileSdk = 34
    defaultConfig {
        applicationId = "com.zartas.genesis"; minSdk = 24; targetSdk = 34; versionCode = 1
        buildConfigField("String", "API_KEY", "\"AIzaSyC5sEEgJG-abRYTbFD6_3LjI-Z3xAykXt8\"")
    }
    buildFeatures { compose = true; buildConfig = true }
    composeOptions { kotlinCompilerExtensionVersion = "1.5.1" }
    kotlinOptions { jvmTarget = "17" }
}
dependencies {
    implementation("com.google.ai.client.generativeai:generativeai:0.9.0")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation(platform("androidx.compose:compose-bom:2023.10.01"))
    implementation("androidx.compose.material3:material3")
}
