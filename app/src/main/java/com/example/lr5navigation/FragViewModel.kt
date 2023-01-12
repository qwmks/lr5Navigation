package com.example.lr5navigation

import android.content.ClipData
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragViewModel : ViewModel() {
    private val mutableSelectedItem = MutableLiveData(false)
    val selectedItem: LiveData<Boolean> get() = mutableSelectedItem

    fun selectItem(item: Boolean) {
        mutableSelectedItem.value = item
    }
}