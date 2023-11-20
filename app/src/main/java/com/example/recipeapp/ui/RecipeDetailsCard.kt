package com.example.recipeapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recipeapp.R
import com.example.recipeapp.model.Item

@Composable
fun RecipeDetailsCard(recipe: Item) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.crepes), // Use your placeholder image
            contentDescription = null,
            modifier = Modifier
                .height(240.dp)
                .fillMaxWidth()
                .clip(shape = MaterialTheme.shapes.medium),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = recipe.title,
            style = MaterialTheme.typography.titleMedium
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = recipe.snippet,
            style = MaterialTheme.typography.bodySmall
        )

        // Add more details as needed based on your data model

        Spacer(modifier = Modifier.height(16.dp))

        // Add any additional UI components for the recipe details
    }
}

@Composable
@Preview
fun RecipeDetailsPreview() {
    val sampleRecipe = Item(
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
    RecipeDetailsCard(recipe = sampleRecipe)
}
