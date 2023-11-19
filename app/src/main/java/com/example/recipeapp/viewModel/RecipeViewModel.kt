// app/src/main/java/com/example/recipeapp/ui/RecipeViewModel.kt
package com.example.recipeapp.viewModel

import ConfigReader
import android.content.Context
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
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

    // Function to perform the recipe search
    fun searchRecipes(query: String) {
        viewModelScope.launch {
            try {
                val apiKey = ConfigReader.getApiKey(context)
                val response = RecipesApi.retrofitService.searchRecipes(query, apiKey, CUSTOM_SEARCH_ENGINE_ID).results
                _recipes.value = response
            } catch (e: Exception) {
                // Handle error
                // You might want to show an error message to the user
            }
        }
    }
}
