package com.bitstem.imagesperformancepoc.service

import android.content.Context

interface IScreenManager {
    fun screenWidth(): Int
}

internal class ScreenManager(
    private val context: Context
) : IScreenManager {

    override fun screenWidth(): Int {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}