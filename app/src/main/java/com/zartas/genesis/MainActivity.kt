package com.zartas.genesis
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.RequestOptions

class MainActivity : ComponentActivity() {
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        // Подключение 3.1 через эндпоинт v1beta
        val model = GenerativeModel(
            modelName = "gemini-3.1-pro-preview",
            apiKey = BuildConfig.API_KEY,
            requestOptions = RequestOptions(apiVersion = "v1beta")
        )
        setContent { Text("Genesis 3.1: Freedom Online") }
    }
}
