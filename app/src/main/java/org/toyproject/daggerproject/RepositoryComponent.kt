package org.toyproject.daggerproject


import dagger.Component
import dagger.Provides
import javax.inject.Singleton

@Singleton
@Component(modules = [RepositoryModule:: class])
interface RepositoryComponent {


    fun injectIntoActivity(activity: DaggerActivity)
}