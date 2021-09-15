package org.toyproject.domain.datasource.remote

import com.example.domain.datasource.remote.Api
import org.toyproject.data.User


class MockApi : Api {

    override fun getUser(): User = User(1, "John Smith")

}