package com.orange.archhelloworld.feature{{featureName.lowerCase()}}.domain.usecase

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class {{featureName.pascalCase()}}UseCase @Inject constructor() : I{{featureName.pascalCase()}}UseCase {
    override fun getHelloWorld(): Flow<String> {
        return flow {
            emit("Hello Practice Mobile")
        }
    }
}