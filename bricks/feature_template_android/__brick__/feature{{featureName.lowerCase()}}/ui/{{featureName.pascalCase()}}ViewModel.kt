package com.orange.{{projectName.lowerCase()}}.featureplaceholder.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.orange.{{projectName.lowerCase()}}.feature{{featureName.lowerCase()}}.domain.usecase.I{{featureName.pascalCase()}}UseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class {{featureName.pascalCase()}}ViewModel @Inject constructor(
    private val {{featureName.lowerCase()}}UseCase: I{{featureName.pascalCase()}}UseCase
) : ViewModel() {

    private val _{{featureName.lowerCase()}}UiState =
        MutableStateFlow<{{featureName.pascalCase()}}UiState>({{featureName.pascalCase()}}UiState.Loading)
    val {{featureName.lowerCase()}}UiState: StateFlow<{{featureName.pascalCase()}}UiState> = _{{featureName.lowerCase()}}UiState.asStateFlow()

    fun onScreenDisplayed() {
        viewModelScope.launch {
            ensureActive()
            {{featureName.lowerCase()}}UseCase.getHelloWorld()
                .map { message ->
                    _{{featureName.lowerCase()}}UiState.value = {{featureName.pascalCase()}}UiState.Success(message)
                }.collect()
        }
    }
}

sealed interface {{featureName.pascalCase()}}UiState {

    data class Success(val message: String) : {{featureName.pascalCase()}}UiState

    object Loading : {{featureName.pascalCase()}}UiState

}