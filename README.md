# RecipeApp: A Simple Recipe Recommender
## Overview:
RecipeApp is a mobile application designed to provide users with a simple and intuitive way to discover and explore various recipes. The app utilizes the Google Search API to fetch recipe-related information based on user queries.

## Key Features:
1. Recipe Search:

    Users can enter keywords or queries in the search bar to find recipes.
    
    The app sends these queries to the Google Search API to retrieve relevant recipe information.

2. Recipe Display:
    
    The search results are displayed as a list of cards, each representing a specific recipe.
    Each card contains an image, title, and snippet of the recipe.

3. Recipe Details:
    
    Users can click on a recipe card to view more details about a specific recipe.
    The app displays additional information, such as ingredients, instructions, or nutritional facts.

4. Simple UI with Jetpack Compose:

    The user interface is built using Jetpack Compose, a modern Android UI toolkit.
    Compose allows for a declarative and concise way to define UI components.

## Development Approach:

1. Jetpack Compose:

    The app leverages Jetpack Compose for building a modern and reactive user interface.
    Compose simplifies UI development by using a Kotlin-based, declarative syntax.

2. Google Search API Integration:

    The app integrates with the Google Search API to fetch recipe data.
    It sends search queries to the API and processes the API responses to display relevant information.

3. ViewModel Architecture:

    The app follows the ViewModel architecture to separate the UI-related data from the UI controllers.
    A RecipeViewModel is responsible for managing and providing recipe-related data to the UI.

4. Simplified Design:

    The app focuses on a simplified design with a clean and easy-to-navigate user interface.
    It aims to provide a quick and enjoyable recipe discovery experience for users.

## Authors

- [Marissa Campa](https://github.com/MarissaCampa)

