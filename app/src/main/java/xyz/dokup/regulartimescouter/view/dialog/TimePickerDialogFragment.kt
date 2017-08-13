package xyz.dokup.regulartimescouter.view.dialog

import android.app.Dialog
import android.app.DialogFragment
import android.app.TimePickerDialog
import android.os.Bundle
import xyz.dokup.regulartimescouter.view.activity.SettingActivity
import java.util.*

/**
 * Created by e10dokup on 2017/07/04.
 */
class TimePickerDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)

        return TimePickerDialog(activity, activity as SettingActivity, hour, minute, true)
    }
}