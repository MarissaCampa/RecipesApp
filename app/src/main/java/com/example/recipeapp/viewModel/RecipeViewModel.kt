package com.example.recipeapp.viewModel

import ConfigReader
import android.content.Context
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.recipeapp.api.RecipesApi
import com.example.recipeapp.model.Recipe
import com.example.recipeapp.utils.Constants.CUSTOM_SEARCH_ENGINE_ID
import kotlinx.coroutines.launch

class RecipeViewModel(private val context: Context) : ViewModel() {

    // LiveData to observe the list of recipes
    // We'll assume you're using LiveData, but you can also use State or MutableState in Compose
    // depending on your Compose version.
    private val _recipes = mutableStateOf<List<Recipe>>(emptyList())
    val recipes: State<List<Recipe>> = _recipes

    // New state for error message
    private val _errorMessage = mutableStateOf<String?>(null)
    val errorMessage: State<String?> = _errorMessage

    // Function to perform the recipe search
    fun searchRecipes(query: String) {
        viewModelScope.launch {
            try {
                val apiKey = ConfigReader.getApiKey(context)
                val response = RecipesApi.retrofitService.searchRecipes(query, apiKey, CUSTOM_SEARCH_ENGINE_ID)

                // Check if the response is successful before processing it
                if (response.isSuccessful) {
                    // Assuming `results` is a property of the `Response` class
                    val recipes = response.body()?.results ?: emptyList()
                    _recipes.value = recipes
                } else {
                    _errorMessage.value = "Failed to retrieve recipes. Please try again."
                }
            } catch (e: Exception) {
                // Handle exception
                _errorMessage.value = "Exception: " + e.message
            }
        }
    }
}

class RecipeViewModelFactory(private val context: Context) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RecipeViewModel::class.java)) {
            return RecipeViewModel(context) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}