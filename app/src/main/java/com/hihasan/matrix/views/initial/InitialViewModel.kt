package com.hihasan.matrix.views.initial

import android.content.Context
import android.content.Intent
import com.hihasan.matrix.utils.App
import com.hihasan.matrix.utils.base.BaseViewModel
import com.hihasan.matrix.views.auth.AuthActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class InitialViewModel : BaseViewModel(context = App.getAppContext()) {

    fun waitScreen(ctx : Context){
        CoroutineScope(IO).launch {
            delay(3000)

            val intent = Intent(ctx, AuthActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            ctx.startActivity(intent)
        }



    }
}