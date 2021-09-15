package com.example.domain.repository.impl


import org.toyproject.domain.datasource.DataSource
import org.toyproject.domain.repository.Repository
import org.toyproject.data.User

class RepositoryImpl(private val remoteDataSource: DataSource) : Repository {

    override fun getUser(): User {
        return remoteDataSource.getUser()
    }
}