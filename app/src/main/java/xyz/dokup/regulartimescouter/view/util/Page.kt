package xyz.dokup.regulartimescouter.view.util

import android.content.Context
import android.content.Intent
import xyz.dokup.regulartimescouter.view.activity.MainActivity
import xyz.dokup.regulartimescouter.view.activity.SettingActivity
import xyz.dokup.regulartimescouter.view.activity.base.BaseActivity

/**
 * Created by e10dokup on 2017/08/13.
 */
enum class Page(val target: Class<out BaseActivity>) {
    MAIN(MainActivity::class.java),
    SETTING(SettingActivity::class.java);

    open fun intent(context: Context) = Intent(context, target)
}