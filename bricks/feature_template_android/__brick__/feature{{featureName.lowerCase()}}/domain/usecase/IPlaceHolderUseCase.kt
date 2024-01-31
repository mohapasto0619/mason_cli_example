package com.orange.archhelloworld.feature{{featureName.lowerCase()}}.domain.usecase

import kotlinx.coroutines.flow.Flow

fun interface I{{featureName.pascalCase()}}UseCase {

    fun getHelloWorld() : Flow<String>

}