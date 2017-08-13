package xyz.dokup.regulartimescouter.datasource

import android.content.SharedPreferences
import xyz.dokup.regulartimescouter.constant.PrefKeys
import javax.inject.Inject

/**
 * Created by e10dokup on 2017/08/13.
 */
class RegularTimeLocalDataSource @Inject constructor(
        private val pref: SharedPreferences) {

    fun getTarget() : Int = pref.getInt(PrefKeys.KEY_TIME, -1)

    fun setTarget(target: Int) = pref.edit().putInt(PrefKeys.KEY_TIME, target).apply()

}