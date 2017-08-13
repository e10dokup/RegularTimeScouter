package xyz.dokup.regulartimescouter.viewmodel

import android.databinding.ObservableField
import android.support.v7.app.AppCompatActivity
import android.view.View
import xyz.dokup.regulartimescouter.R
import xyz.dokup.regulartimescouter.repository.RegularTimeRepository
import xyz.dokup.regulartimescouter.view.activity.SettingActivity
import xyz.dokup.regulartimescouter.view.dialog.TimePickerDialogFragment
import xyz.dokup.regulartimescouter.viewmodel.base.ActivityViewModel
import javax.inject.Inject

/**
 * Created by e10dokup on 2017/07/02.
 */
class SettingActivityViewModel @Inject constructor(
        val activity: AppCompatActivity,
        val regularTimeRepository: RegularTimeRepository
): ActivityViewModel() {

    val regularTime = ObservableField<String>()

    override fun onStart() {
    }

    override fun onResume() {
        val target = regularTimeRepository.getTarget()
        if (target == -1) {
            regularTime.set(activity.getString(R.string.have_not_set))
            return
        }
        indicateTarget(target)
    }
    override fun onPause() {
    }

    override fun onStop() {
    }

    fun onSetTarget(hour: Int, minute: Int) {
        val target = hour * 100 + minute
        regularTimeRepository.setTarget(target)
        indicateTarget(target)
    }

    fun onClickRegularTimeChangeButton(v: View) {
        val dialogFragment = TimePickerDialogFragment()
        dialogFragment.show((activity as SettingActivity).fragmentManager, "time_picker")
    }

    private fun indicateTarget(target: Int) {
        val hour = target / 100
        val minute = target % 100
        regularTime.set("%02d : %02d".format(hour, minute))
    }

}