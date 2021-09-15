package org.toyproject.domain.datasource.impl


import org.toyproject.domain.datasource.DataSource
import com.example.domain.datasource.remote.Api
import org.toyproject.data.User

class RemoteDataSourceImpl(private val api: Api) : DataSource {

    override fun getUser(): User {
        return api.getUser()
    }

}
