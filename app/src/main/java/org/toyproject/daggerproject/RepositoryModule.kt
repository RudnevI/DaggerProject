package org.toyproject.daggerproject


import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

   /* @Provides
    fun getApi(): Api = MockApi()

    @Provides
    fun getDataSource() : DataSource = RemoteDataSourceImpl(getApi())

    @Provides
    fun getRepository(): Repository = RepositoryImpl(getDataSource())*/

    @Singleton
    @Provides
    fun getRepo() : TestRepo = TestRepo()
}