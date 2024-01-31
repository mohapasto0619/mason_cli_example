package com.orange.{{projectName.lowerCase()}}.feature{{featureName.lowerCase()}}.ui

import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.orange.{{projectName.lowerCase()}}.designsystem.annotations.ThemePreviews
import com.orange.{{projectName.lowerCase()}}.designsystem.components.{{projectName.pascalCase()}}Loader
import com.orange.{{projectName.lowerCase()}}.designsystem.theme.{{projectName.pascalCase()}}Theme

@Composable
fun {{featureName.pascalCase()}}Screen(
    modifier: Modifier = Modifier,
    {{featureName.pascalCase()}}ViewModel: {{featureName.pascalCase()}}ViewModel = hiltViewModel()
) {

    val uiState by {{featureName.pascalCase()}}ViewModel.{{featureName.lowerCase()}}UiState.collectAsStateWithLifecycle()

    LaunchedEffect(uiState) {
        {{featureName.lowerCase()}}ViewModel.onScreenDisplayed()
    }

    Surface(modifier.fillMaxSize()) {
        BoxWithConstraints(contentAlignment = Alignment.Center) {
            when (uiState) {
                is {{featureName.pascalCase()}}UiState.Loading -> MasonAndroidTestAppLoader()
                is {{featureName.pascalCase()}}UiState.Success -> Greeting((uiState as {{featureName.pascalCase()}}UiState.Success).message)
            }
        }
    }
}

@Composable
fun Greeting(message: String) {
    Text(
        text = message, style = MaterialTheme.typography.headlineLarge
    )
}

@ThemePreviews
@Composable
fun DefaultPreview() {
    MasonAndroidTestAppTheme {
        Greeting("Android")
    }
}