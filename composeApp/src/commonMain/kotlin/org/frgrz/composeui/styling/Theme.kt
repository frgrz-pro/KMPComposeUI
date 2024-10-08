// Generated using MaterialKolor Builder version 1.0.1 (101)
// https://materialkolor.com/?color_seed=FF68A500&dark_mode=true&style=Vibrant&selected_preset_id=res-0&contrast=1.0

package org.frgrz.composeui.styling

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import com.example.BackgroundDarkHighContrast
import com.example.BackgroundLightHighContrast
import com.example.ErrorContainerDarkHighContrast
import com.example.ErrorContainerLightHighContrast
import com.example.ErrorDarkHighContrast
import com.example.ErrorLightHighContrast
import com.example.InverseOnSurfaceDarkHighContrast
import com.example.InverseOnSurfaceLightHighContrast
import com.example.InversePrimaryDarkHighContrast
import com.example.InversePrimaryLightHighContrast
import com.example.InverseSurfaceDarkHighContrast
import com.example.InverseSurfaceLightHighContrast
import com.example.OnBackgroundDarkHighContrast
import com.example.OnBackgroundLightHighContrast
import com.example.OnErrorContainerDarkHighContrast
import com.example.OnErrorContainerLightHighContrast
import com.example.OnErrorDarkHighContrast
import com.example.OnErrorLightHighContrast
import com.example.OnPrimaryContainerDarkHighContrast
import com.example.OnPrimaryContainerLightHighContrast
import com.example.OnPrimaryDarkHighContrast
import com.example.OnPrimaryLightHighContrast
import com.example.OnSecondaryContainerDarkHighContrast
import com.example.OnSecondaryContainerLightHighContrast
import com.example.OnSecondaryDarkHighContrast
import com.example.OnSecondaryLightHighContrast
import com.example.OnSurfaceDarkHighContrast
import com.example.OnSurfaceLightHighContrast
import com.example.OnSurfaceVariantDarkHighContrast
import com.example.OnSurfaceVariantLightHighContrast
import com.example.OnTertiaryContainerDarkHighContrast
import com.example.OnTertiaryContainerLightHighContrast
import com.example.OnTertiaryDarkHighContrast
import com.example.OnTertiaryLightHighContrast
import com.example.OutlineDarkHighContrast
import com.example.OutlineLightHighContrast
import com.example.OutlineVariantDarkHighContrast
import com.example.OutlineVariantLightHighContrast
import com.example.PrimaryContainerDarkHighContrast
import com.example.PrimaryContainerLightHighContrast
import com.example.PrimaryDarkHighContrast
import com.example.PrimaryLightHighContrast
import com.example.ScrimDarkHighContrast
import com.example.ScrimLightHighContrast
import com.example.SecondaryContainerDarkHighContrast
import com.example.SecondaryContainerLightHighContrast
import com.example.SecondaryDarkHighContrast
import com.example.SecondaryLightHighContrast
import com.example.SurfaceBrightDarkHighContrast
import com.example.SurfaceBrightLightHighContrast
import com.example.SurfaceContainerDarkHighContrast
import com.example.SurfaceContainerHighDarkHighContrast
import com.example.SurfaceContainerHighLightHighContrast
import com.example.SurfaceContainerHighestDarkHighContrast
import com.example.SurfaceContainerHighestLightHighContrast
import com.example.SurfaceContainerLightHighContrast
import com.example.SurfaceContainerLowDarkHighContrast
import com.example.SurfaceContainerLowLightHighContrast
import com.example.SurfaceContainerLowestDarkHighContrast
import com.example.SurfaceContainerLowestLightHighContrast
import com.example.SurfaceDarkHighContrast
import com.example.SurfaceDimDarkHighContrast
import com.example.SurfaceDimLightHighContrast
import com.example.SurfaceLightHighContrast
import com.example.SurfaceVariantDarkHighContrast
import com.example.SurfaceVariantLightHighContrast
import com.example.TertiaryContainerDarkHighContrast
import com.example.TertiaryContainerLightHighContrast
import com.example.TertiaryDarkHighContrast
import com.example.TertiaryLightHighContrast

private val highContrastLightColorScheme = lightColorScheme(
    primary = PrimaryLightHighContrast,
    onPrimary = OnPrimaryLightHighContrast,
    primaryContainer = PrimaryContainerLightHighContrast,
    onPrimaryContainer = OnPrimaryContainerLightHighContrast,
    secondary = SecondaryLightHighContrast,
    onSecondary = OnSecondaryLightHighContrast,
    secondaryContainer = SecondaryContainerLightHighContrast,
    onSecondaryContainer = OnSecondaryContainerLightHighContrast,
    tertiary = TertiaryLightHighContrast,
    onTertiary = OnTertiaryLightHighContrast,
    tertiaryContainer = TertiaryContainerLightHighContrast,
    onTertiaryContainer = OnTertiaryContainerLightHighContrast,
    error = ErrorLightHighContrast,
    onError = OnErrorLightHighContrast,
    errorContainer = ErrorContainerLightHighContrast,
    onErrorContainer = OnErrorContainerLightHighContrast,
    background = BackgroundLightHighContrast,
    onBackground = OnBackgroundLightHighContrast,
    surface = SurfaceLightHighContrast,
    onSurface = OnSurfaceLightHighContrast,
    surfaceVariant = SurfaceVariantLightHighContrast,
    onSurfaceVariant = OnSurfaceVariantLightHighContrast,
    outline = OutlineLightHighContrast,
    outlineVariant = OutlineVariantLightHighContrast,
    scrim = ScrimLightHighContrast,
    inverseSurface = InverseSurfaceLightHighContrast,
    inverseOnSurface = InverseOnSurfaceLightHighContrast,
    inversePrimary = InversePrimaryLightHighContrast,
    surfaceDim = SurfaceDimLightHighContrast,
    surfaceBright = SurfaceBrightLightHighContrast,
    surfaceContainerLowest = SurfaceContainerLowestLightHighContrast,
    surfaceContainerLow = SurfaceContainerLowLightHighContrast,
    surfaceContainer = SurfaceContainerLightHighContrast,
    surfaceContainerHigh = SurfaceContainerHighLightHighContrast,
    surfaceContainerHighest = SurfaceContainerHighestLightHighContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = PrimaryDarkHighContrast,
    onPrimary = OnPrimaryDarkHighContrast,
    primaryContainer = PrimaryContainerDarkHighContrast,
    onPrimaryContainer = OnPrimaryContainerDarkHighContrast,
    secondary = SecondaryDarkHighContrast,
    onSecondary = OnSecondaryDarkHighContrast,
    secondaryContainer = SecondaryContainerDarkHighContrast,
    onSecondaryContainer = OnSecondaryContainerDarkHighContrast,
    tertiary = TertiaryDarkHighContrast,
    onTertiary = OnTertiaryDarkHighContrast,
    tertiaryContainer = TertiaryContainerDarkHighContrast,
    onTertiaryContainer = OnTertiaryContainerDarkHighContrast,
    error = ErrorDarkHighContrast,
    onError = OnErrorDarkHighContrast,
    errorContainer = ErrorContainerDarkHighContrast,
    onErrorContainer = OnErrorContainerDarkHighContrast,
    background = BackgroundDarkHighContrast,
    onBackground = OnBackgroundDarkHighContrast,
    surface = SurfaceDarkHighContrast,
    onSurface = OnSurfaceDarkHighContrast,
    surfaceVariant = SurfaceVariantDarkHighContrast,
    onSurfaceVariant = OnSurfaceVariantDarkHighContrast,
    outline = OutlineDarkHighContrast,
    outlineVariant = OutlineVariantDarkHighContrast,
    scrim = ScrimDarkHighContrast,
    inverseSurface = InverseSurfaceDarkHighContrast,
    inverseOnSurface = InverseOnSurfaceDarkHighContrast,
    inversePrimary = InversePrimaryDarkHighContrast,
    surfaceDim = SurfaceDimDarkHighContrast,
    surfaceBright = SurfaceBrightDarkHighContrast,
    surfaceContainerLowest = SurfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = SurfaceContainerLowDarkHighContrast,
    surfaceContainer = SurfaceContainerDarkHighContrast,
    surfaceContainerHigh = SurfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = SurfaceContainerHighestDarkHighContrast,
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit,
) {
    val colorScheme = when {
        darkTheme -> highContrastDarkColorScheme
        else -> highContrastLightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        content = content,
    )
}