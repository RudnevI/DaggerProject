package com.example.domain.datasource.remote

import org.toyproject.data.User


interface Api {

    fun getUser(): User
}