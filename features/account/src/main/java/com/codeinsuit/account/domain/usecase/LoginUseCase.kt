package com.codeinsuit.account.domain.usecase

import androidx.annotation.WorkerThread

class LoginUseCase {

    sealed class LoginResult {
        //...
    }

    @WorkerThread
    fun logIn(username: String, password: String): LoginResult {
        //...
    }
}
