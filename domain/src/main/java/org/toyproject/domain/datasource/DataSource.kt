package org.toyproject.domain.datasource

import org.toyproject.data.User


interface DataSource {

    fun getUser(): User

}