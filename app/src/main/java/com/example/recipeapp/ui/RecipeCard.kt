package com.example.recipeapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.recipeapp.model.Item

@Composable
fun RecipeCard(recipe: Item) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        )
    ) {
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
                .clickable { /* Handle click on recipe item */ }
        ) {
            AsyncImage(
                model = recipe.pagemap!!?.cseImage?.get(0)?.src,
                contentDescription = null,
                modifier = Modifier
                        .height(180.dp)
                        .fillMaxWidth()
                        .clip(shape = MaterialTheme.shapes.medium),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = recipe.title,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = recipe.snippet,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
@Preview
fun RecipeItemPreview() {
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
    RecipeCard(recipe = sampleRecipe)
}
