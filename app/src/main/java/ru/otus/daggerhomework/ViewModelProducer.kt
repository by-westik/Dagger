package ru.otus.daggerhomework

import android.content.Context
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.MutableLiveData

class ViewModelProducer(
    private val colorGenerator: ColorGenerator,
    private val context: Context,
    private val mutableLiveData: MutableLiveData<Int>
) {

    fun generateColor() {
        if (context !is FragmentActivity) throw RuntimeException("Здесь нужен контекст активити")
        Toast.makeText(context, "Color sent", Toast.LENGTH_LONG).show()
        mutableLiveData.value = colorGenerator.generateColor()
    }
}