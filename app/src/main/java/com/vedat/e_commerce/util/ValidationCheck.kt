package com.vedat.e_commerce.util

import android.util.Patterns

fun validateEmail(email: String): RegisterValidation{
    if (email.isEmpty())
        return RegisterValidation.Failed("Email Boş geçilemez")

    if (!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        return RegisterValidation.Failed("yanlış Email")

    return RegisterValidation.Success
}

fun validatePassword(password: String): RegisterValidation{
    if (password.isEmpty())
        return RegisterValidation.Failed("Şifre Boş Geçilemez")

    if (password.length < 6)
        return RegisterValidation.Failed("Şifre 6 haneden daha az olmamalı")

    return RegisterValidation.Success
}