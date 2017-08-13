package xyz.dokup.regulartimescouter.view.util

import android.support.v7.app.AppCompatActivity
import xyz.dokup.regulartimescouter.di.scope.ActivityScope
import xyz.dokup.regulartimescouter.extension.go
import javax.inject.Inject

/**
 * Created by e10dokup on 2017/08/13.
 */
@ActivityScope
class Navigator @Inject constructor(activity: AppCompatActivity){

    private val activity = activity

    fun NavigateToSetting() {
        activity.go(Page.SETTING)
    }

}