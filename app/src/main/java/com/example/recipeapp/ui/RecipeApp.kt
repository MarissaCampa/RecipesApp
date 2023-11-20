package com.example.recipeapp

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.recipeapp.model.Item
import com.example.recipeapp.ui.RecipeCard
import com.example.recipeapp.ui.RecipeDetailsCard
import com.example.recipeapp.viewModel.RecipeViewModel
import com.example.recipeapp.viewModel.RecipeViewModelFactory


@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class,
    ExperimentalComposeUiApi::class
)
@Composable
fun RecipeApp(context: Context, viewModel: RecipeViewModel = viewModel(factory = RecipeViewModelFactory(context))) {
    var query by remember { mutableStateOf("") }
    var selectedRecipe by remember { mutableStateOf<Item?>(null) }

    val recipes by viewModel.recipes

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        // Search Bar
        var keyboardController = LocalSoftwareKeyboardController.current

        OutlinedTextField(
            value = query,
            onValueChange = { query = it },
            label = { Text("Search for recipes") },
            singleLine = true,
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    viewModel.searchRecipes(query)
                    // Close the keyboard
                    keyboardController?.hide()
                }
            ),
            modifier = Modifier.padding(16.dp)
        )

        // Recipe List
        LazyColumn {
            items(recipes.size) { index ->
                RecipeCard(recipe = recipes[index])
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
        // Recipe Details
        selectedRecipe?.let { recipe ->
            RecipeDetailsCard(recipe = recipe)
        }

        // Error message
        val errorMessage = viewModel.errorMessage.value
        if (!errorMessage.isNullOrBlank()) {
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = errorMessage,
                color = Color.Red,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}
