package com.mobile.futguess.ui.login

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() { // Herdando de viewmodel!!

    val email = mutableStateOf("")
    val password = mutableStateOf("")

    fun onEmailChange(newEmail: String) {
        email.value = newEmail
    }

    fun onPasswordChange(newPassword: String) {
        password.value = newPassword
    }

}