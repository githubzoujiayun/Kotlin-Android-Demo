package com.example.lazy.kotlin.anko

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.lazy.kotlin.R
import com.example.lazy.kotlin.douban.anko.component.LoadingFragment
import com.example.lazy.kotlin.module.extension.receiverTransaction
import com.example.lazy.kotlin.module.extension.setContainerViewUI

class AnkoPreviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContainerViewUI(this)
        with(receiverTransaction) {
            replace(R.id.containerViewId, LoadingFragment())
            commit()
        }
    }

}

