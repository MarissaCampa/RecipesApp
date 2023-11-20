# RecipeApp: A Recipe Finder
RecipeApp is a mobile application designed to provide users with a simple and intuitive way to discover and explore various recipes. The app utilizes the Google Search API to fetch recipe-related information based on user queries.

## Key Features:

For the first version of this app, I focused on getting the following features: 

### Recipe Search:
Users can enter keywords or queries in the search bar to find recipes. The app sends these queries to the Google Search API to retrieve relevant recipe information.

### Recipe Display:
The search results are displayed as a list of cards, each representing a specific recipe. Each card contains an image, title, and snippet of the recipe.

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

![Event Image](https://hopin-prod-fe-page-builder.imgix.net/events/page_builder/000/431/139/original/2ba62a77-2398-4579-b7a2-e54dae8bd250.png?ixlib=rb-4.1.0&s=bd16fec9cf93a6456550246d022de4e5)

## Authors

- [Marissa Campa](https://github.com/MarissaCampa)
