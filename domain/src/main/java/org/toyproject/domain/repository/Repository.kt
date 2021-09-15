package org.toyproject.domain.repository


import org.toyproject.data.User


interface Repository {


    fun getUser(): User


}