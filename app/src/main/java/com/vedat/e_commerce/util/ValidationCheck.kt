package com.vedat.e_commerce.util

import android.util.Patterns

fun validateEmail(email:String):RegisterValidation{
    if (email.isEmpty())
        return RegisterValidation.Failed("email bos Gecilemez")
    if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        return RegisterValidation.Failed("yanlış email ,sıfırla")

    return RegisterValidation.Success
}

fun validationPassword(password:String):RegisterValidation{
    if(password.isEmpty())
        return RegisterValidation.Failed("Sifre bos olmamalı")
    if(password.length<6)
        return RegisterValidation.Failed("sifre 6 haneli olmalı")
    return RegisterValidation.Success
}