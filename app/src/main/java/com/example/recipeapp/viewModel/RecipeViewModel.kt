package com.example.recipeapp.viewModel

import ConfigReader
import android.content.Context
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.recipeapp.api.RecipesApi
import com.example.recipeapp.model.Item
import com.example.recipeapp.model.Root
import com.example.recipeapp.utils.Constants.CUSTOM_SEARCH_ENGINE_ID
import kotlinx.coroutines.launch

class RecipeViewModel(private val context: Context) : ViewModel() {

    // LiveData to observe the list of recipes
    private val _recipes = mutableStateOf<List<Item>>(emptyList())
    val recipes: State<List<Item>> = _recipes

    // New state for error message
    private val _errorMessage = mutableStateOf<String?>(null)
    val errorMessage: State<String?> = _errorMessage

    // Function to perform the recipe search
    fun searchRecipes(query: String) {
        viewModelScope.launch {
            try {
                val apiKey = ConfigReader.getApiKey(context)
                val response: Root
                val recipeQuery = query + "recipe"
                response = RecipesApi.retrofitService.searchRecipes(recipeQuery, apiKey, CUSTOM_SEARCH_ENGINE_ID)
                _recipes.value = response.items
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