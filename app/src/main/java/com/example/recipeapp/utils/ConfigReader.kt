// ConfigReader.kt

import android.content.Context
import com.example.recipeapp.R
import java.io.InputStream
import java.util.Properties

object ConfigReader {
    fun getApiKey(context: Context): String {
        val properties = Properties()
        val rawResource: InputStream = context.resources.openRawResource(R.raw.config)
        properties.load(rawResource)
        return properties.getProperty("API_KEY", "")
    }
}