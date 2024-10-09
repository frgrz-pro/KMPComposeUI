package org.frgrz.composeui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.runtime.*
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import org.frgrz.composeui.features.home.HomeScreen
import org.frgrz.composeui.styling.AppTheme


@Composable
@Preview
fun App() {
    AppTheme {
        Navigator(HomeScreen()) { navigator ->
            SlideTransition(navigator)
        }
    }
}