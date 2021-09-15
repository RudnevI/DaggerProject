package org.toyproject.daggerproject

import org.toyproject.data.User
import javax.inject.Inject

class TestRepo @Inject constructor() {


    fun getUser(): User {
        return User(1, "SAMPLE NAME")
    }
}