package org.frgrz.composeui.components

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kmpcomposeui.composeapp.generated.resources.Res
import org.frgrz.composeui.styling.AppTheme

@Composable
fun ErrorScreen(message: String? = null) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 24.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text = message ?: "Empty")
    }
}

@Preview
@Composable
fun ErrorScreenPreview() {
    AppTheme {
        ErrorScreen(
            //Res.string.error
        )
    }
}