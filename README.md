# RecipeApp: A Recipe Finder
RecipeApp is a mobile application designed to provide users with a simple and intuitive way to discover and explore various recipes. The app utilizes the Google Search API to fetch recipe-related information based on user queries.

## Presentation
https://www.canva.com/design/DAF0wOopVf4/QnGUTsSPxEwkXeJu6JUbmw/view?utm_content=DAF0wOopVf4#6

## Key Features:
For the first version of this app, I focused on getting the following features: 

### Recipe Search:
Users can enter keywords or queries in the search bar to find recipes. The app sends these queries to the Google Search API to retrieve relevant recipe information.

<img src='https://github.com/MarissaCampa/RecipesApp/assets/3021010/d7dacfdf-3eb1-4359-a1eb-1d78b34254e1' width='200'>
<img src='https://github.com/MarissaCampa/RecipesApp/assets/3021010/6f571aec-5d5f-43be-a9e8-98b2f4bf9f9e' width='200'>

### Recipe Display:
The search results are displayed as a list of cards, each representing a specific recipe. Each card contains an image, title, and snippet of the recipe.

<img src='https://github.com/MarissaCampa/RecipesApp/assets/3021010/68e1ed4e-5317-4444-89a5-35f485340a23' width='200'>
<img src='https://github.com/MarissaCampa/RecipesApp/assets/3021010/db888d7d-40cf-4c1b-a315-61ee124b9e64' width='200'>

## Development Approach:

#### 1. Jetpack Compose:
The app leverages Jetpack Compose for building a modern and reactive user interface. Compose simplifies UI development by using a Kotlin-based, declarative syntax.

#### 2. Google Search API Integration:
The app integrates with the Google Search API to fetch recipe data. It sends search queries to the API and processes the API responses to display relevant information.

#### 3. ViewModel Architecture:
The app follows the ViewModel architecture to separate the UI-related data from the UI controllers. A RecipeViewModel is responsible for managing and providing recipe-related data to the UI.

#### 4. Simplified Design:
The app focuses on a simplified design with a clean and easy-to-navigate user interface. It aims to provide a quick and enjoyable recipe discovery experience for users.

## About the API Key to use the app
Since this app uses the Google Search API, it needs an API Key to make the network calls.

I added an API_KEY variable to the file `RecipeApp\app\src\main\res\raw\config.properties`:

```
// RecipeApp\app\src\main\res\raw\config.properties
API_KEY=YOUR_API_KEY_HERE

```
And the key is accessed by the `ConfigReader.getApiKey(): String` function.

## Next Steps
I focused on getting a MVP that would fetch the data from the Google Search API and display the results in a list of Composable UI Cards. Some of the next steps for the development of this app are:

#### 1. Recipe Details Page:
Users can click on a recipe card to view more details about a specific recipe. The app displays additional information, such as ingredients, instructions, or nutritional facts. This will have to elaborate on how to be able to get this information from a link provided by the Google Search API.

#### 2. User Authentication
Users have the option to login into the app, for a personalized user experience. This can lead to having access to lists, saved recipes, ideas list, etc.

#### 3. Navigation Menu
Add a navigation menu to that users can navigate to the Home screen, preferences, saved recipes, lists, etc.

#### 4. User Recipe Lists
Users are able to create lists for grouping saved recipes into categories, for example: “Easy desserts” or “Thanksgiving favorites”.

## Hackathon
This project was created for:
#### [WWCode App Deploy Hackathon in Partnership with Google Play](https://hopin.com/events/wwcode-app-deploy/registration)

![image](https://github.com/MarissaCampa/RecipesApp/assets/3021010/74864f9b-94bf-4b33-821c-48ca89870aea)

## Update
*First place of the WWCode App Deploy Hackathon with Google Play*

![hackathon_winners](https://github.com/MarissaCampa/RecipesApp/assets/3021010/7a1a067b-f4c1-4708-995e-72a72be47fb8)


## Author

- [Marissa Campa](https://github.com/MarissaCampa)
