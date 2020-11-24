package com.example.galacticon

import android.service.media.MediaBrowserService
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes

class Extensions {
    fun ViewGroup.inflate(@LayoutRes layoutRes:Int, attachToRoot: Boolean = false):View
    {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }

}