package xyz.dokup.regulartimescouter.viewmodel

import android.databinding.ObservableField
import android.support.v7.app.AppCompatActivity
import android.view.View
import xyz.dokup.regulartimescouter.view.activity.SettingActivity
import xyz.dokup.regulartimescouter.view.dialog.TimePickerDialogFragment
import xyz.dokup.regulartimescouter.viewmodel.base.ActivityViewModel
import javax.inject.Inject

/**
 * Created by e10dokup on 2017/07/02.
 */
class SettingActivityViewModel @Inject constructor(val activity: AppCompatActivity): ActivityViewModel() {

    val regularTime = ObservableField<String>()

    init {
        regularTime.set("19:00")
    }

    override fun onStart() {
    }

    override fun onResume() {
    }

    override fun onPause() {
    }

    override fun onStop() {
    }

    fun onClickRegularTimeChangeButton(v: View) {
        val dialogFragment = TimePickerDialogFragment()
        dialogFragment.show((activity as SettingActivity).fragmentManager, "time_picker")
    }
}