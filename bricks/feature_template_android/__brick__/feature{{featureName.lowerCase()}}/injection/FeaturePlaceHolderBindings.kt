package com.orange.archhelloworld.featureplaceholder.injection

import com.orange.archhelloworld.feature{{featureName.lowerCase()}}.domain.usecase.I{{featureName.pascalCase()}}UseCase
import com.orange.archhelloworld.feature{{featureName.lowerCase()}}.domain.usecase.{{featureName.pascalCase()}}UseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal interface Feature{{featureName.pascalCase()}}Bindings {

    ///////////////////////////////////////////////////////////////////////////
    // Use cases
    ///////////////////////////////////////////////////////////////////////////
    @Binds
    @Singleton
    fun get{{featureName.pascalCase()}}UseCase({{featureName.lowerCase()}}UseCase: {{featureName.pascalCase()}}UseCase): I{{featureName.pascalCase()}}UseCase
}