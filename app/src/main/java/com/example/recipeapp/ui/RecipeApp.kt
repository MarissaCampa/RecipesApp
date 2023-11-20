package com.example.recipeapp

import android.content.Context
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.FontWeight
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
        Text(
            text = "Recipe Finder",
            style = MaterialTheme.typography.headlineLarge.copy(
                fontWeight = FontWeight.ExtraBold,
                color = MaterialTheme.colorScheme.primary
            ),
            modifier = Modifier
                .padding(top =  20.dp)
                .align(Alignment.CenterHorizontally)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Text field for search query
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
                modifier = Modifier
                    .weight(0.8f)
                    .padding(end = 8.dp)
            )

            // Search button
            Surface(
                modifier = Modifier
                    .weight(0.2f),
                color = MaterialTheme.colorScheme.primary,
                shape = CircleShape
            ) {
                IconButton(
                    onClick = {
                        viewModel.searchRecipes(query)
                        keyboardController?.hide()
                    },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Search",
                        tint = MaterialTheme.colorScheme.onPrimary
                    )
                }
            }
        }

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
