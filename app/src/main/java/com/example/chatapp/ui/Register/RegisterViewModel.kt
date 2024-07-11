package com.example.chatapp.ui.Register

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class RegisterViewModel: ViewModel() {
    val UserName=ObservableField<String>()
    val UserNameError=ObservableField<String>()
    val Email=ObservableField<String>()
    val EmailError=ObservableField<String>()
    val Password=ObservableField<String>()
    val PasswordError=ObservableField<String>()
    val ConfirmPassword=ObservableField<String>()
    val ConfirmPasswordError=ObservableField<String>()


    fun createAccount(){
        if(validate()){

        }

    }
    fun validate():Boolean{
        var valid:Boolean=true

        if(UserName.get().isNullOrBlank()){
            UserNameError.set("Enter The User Name")
            valid=false
        }else{
            UserNameError.set(null)
        }

        if(Email.get().isNullOrBlank()){
            EmailError.set("Enter The User Name")
            valid=false
        }else{
            EmailError.set(null)
        }

        if(Password.get().isNullOrBlank()){
            PasswordError.set("Enter The User Name")
            valid=false
        }else{
            PasswordError.set(null)
        }

        if(ConfirmPassword.get().isNullOrBlank()){
            ConfirmPasswordError.set("Enter The User Name")
            valid=false
        }else{
            ConfirmPasswordError.set(null)
        }

        return valid
    }
}