package com.example.chatapp.ui

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.chatapp.Base.BaseActivity
import com.example.chatapp.R
import com.example.chatapp.databinding.RegisterActivityBinding
import com.example.chatapp.ui.Register.RegisterViewModel

class RegisterActivity: BaseActivity<RegisterActivityBinding, RegisterViewModel>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // this line to connect the dataBinding with viewModel to the same activity
        viewDataBinding.vm=ItemViewModel  //vm is the variable in xml file (register_activity)
    }

    override fun getLayoutId(): Int {
        return R.layout.register_activity
    }

    override fun initViewModel(): RegisterViewModel {
        return ViewModelProvider(this).get(RegisterViewModel::class.java)
    }
}