package com.example.androiddevchallenge.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.model.DogRepo
import com.example.androiddevchallenge.model.testDogs
import com.example.androiddevchallenge.ui.Destinations.DOG_ID

object Destinations {
    const val OVERVIEW = "overview"
    const val DETAIL_ROUTE = "detail"
    const val DOG_ID = "dogId"
}

@Composable
fun NavGraph(startDestination: String = Destinations.OVERVIEW) {
    val navController = rememberNavController()

    val actions = remember(navController) { MainActions(navController) }

    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(Destinations.OVERVIEW) {
            Overview(
                dogs = DogRepo.getDogs(),
                selectDog = actions.selectDog
            )
        }
        composable(
            route = "${Destinations.DETAIL_ROUTE}/{$DOG_ID}",
            arguments = listOf(navArgument(DOG_ID) { type = NavType.LongType })
        ) { backStackEntry ->
            val arguments = requireNotNull(backStackEntry.arguments)
            Detail(
                dogId = arguments.getLong(DOG_ID),
                upPress = actions.upPress
            )
        }
    }
}

class MainActions(navController: NavHostController) {
    val selectDog: (Long) -> Unit = { dogId ->
        navController.navigate("${Destinations.DETAIL_ROUTE}/$dogId")
    }
    val upPress: () -> Unit = {
        navController.navigateUp()
    }
}