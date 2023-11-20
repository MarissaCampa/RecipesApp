// app/src/main/java/com/example/recipeapp/ui/RecipeList.kt
package com.example.recipeapp.ui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recipeapp.model.Item

@Composable
fun RecipeList(recipes: List<Item>) {
    LazyColumn {
        items(recipes.size) { index ->
            RecipeCard(recipe = recipes[index])
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Composable
@Preview
fun RecipeListPreview() {
    val sampleRecipes = List(5) {
        Item(
            title = "Sample Recipe",
            snippet = "This is a sample recipe snippet. You can replace it with the actual recipe details.",
            kind = "",
            htmlTitle = "",
            link = "",
            displayLink = "",
            htmlSnippet = "",
            cacheId = "",
            formattedUrl = "",
            htmlFormattedUrl = "",
            pagemap = null
        )
    }
    RecipeList(recipes = sampleRecipes)
}
