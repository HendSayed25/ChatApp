package com.example.chatapp.Base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel

open abstract class BaseActivity <DB: ViewDataBinding,VM:ViewModel>:AppCompatActivity(){
  lateinit var viewDataBinding:DB
  lateinit var ItemViewModel:VM

  override fun onCreate(savedInstanceState: Bundle?) {
   super.onCreate(savedInstanceState)

   viewDataBinding=DataBindingUtil.setContentView(this,getLayoutId())
   ItemViewModel=  initViewModel()


  }
  abstract fun getLayoutId():Int //to get the xml file which i use it in it's activity
  abstract fun initViewModel():VM //to get the class of viewModel  which i use it in it's activity


}