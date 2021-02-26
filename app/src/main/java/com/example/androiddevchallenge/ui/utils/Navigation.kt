package com.example.androiddevchallenge.ui.utils

import androidx.activity.OnBackPressedDispatcher
import androidx.compose.runtime.staticCompositionLocalOf

//Copied from 'Owl' example app
/**
 * An [androidx.compose.runtime.Ambient] providing the current [OnBackPressedDispatcher]. You must
 * [provide][androidx.compose.runtime.Providers] a value before use.
 */
internal val LocalBackDispatcher = staticCompositionLocalOf<OnBackPressedDispatcher> {
    error("No Back Dispatcher provided")
}
