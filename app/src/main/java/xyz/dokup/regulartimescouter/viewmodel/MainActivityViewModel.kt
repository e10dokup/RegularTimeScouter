package xyz.dokup.regulartimescouter.viewmodel

import android.content.Context
import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import android.view.View
import xyz.dokup.regulartimescouter.R
import xyz.dokup.regulartimescouter.viewmodel.base.ActivityViewModel
import javax.inject.Inject

/**
 * Created by e10dokup on 2017/07/02.
 */
class MainActivityViewModel @Inject constructor(context: Context): ActivityViewModel() {

    val regularTimePower = ObservableField<String>()
    val averageTime = ObservableField<String>()
    val bestTime = ObservableField<String>()
    val worstTime = ObservableField<String>()

    val arriving = ObservableBoolean(false)

    init {
        regularTimePower.set(context.getString(R.string.uncalcable))
        averageTime.set(context.getString(R.string.uncalcable))
        bestTime.set(context.getString(R.string.uncalcable))
        worstTime.set(context.getString(R.string.uncalcable))
    }

    override fun onStart() {
    }

    override fun onResume() {
    }

    override fun onPause() {
    }

    override fun onStop() {
    }

    fun onClickStateChangeButton(v: View) {
        arriving.set(!arriving.get())
    }

    fun onSelectSettingMenu() {

    }
}