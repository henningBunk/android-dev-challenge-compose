package com.example.androiddevchallenge

import androidx.activity.OnBackPressedDispatcher
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.example.androiddevchallenge.model.testDogs
import com.example.androiddevchallenge.ui.Overview
import com.example.androiddevchallenge.ui.NavGraph
import com.example.androiddevchallenge.ui.utils.LocalBackDispatcher

@Composable
fun WuffWuffApp(backDispatcher: OnBackPressedDispatcher) {
    Surface(color = MaterialTheme.colors.background) {
        CompositionLocalProvider(LocalBackDispatcher provides backDispatcher ) {
            NavGraph()
        }
    }
}

//@Preview("Light Theme", widthDp = 360, heightDp = 640)
//@Composable
//fun LightPreview() {
//    MyTheme {
//        WuffWuffApp()
//    }
//}
//
//@Preview("Dark Theme", widthDp = 360, heightDp = 640)
//@Composable
//fun DarkPreview() {
//    MyTheme(darkTheme = true) {
//        WuffWuffApp()
//    }
//}
