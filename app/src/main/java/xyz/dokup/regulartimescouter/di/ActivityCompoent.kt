package xyz.dokup.regulartimescouter.di

import dagger.Subcomponent
import xyz.dokup.regulartimescouter.di.scope.ActivityScope
import xyz.dokup.regulartimescouter.view.activity.MainActivity
import xyz.dokup.regulartimescouter.view.activity.SettingActivity

/**
 * Created by e10dokup on 2017/07/02.
 */
@ActivityScope
@Subcomponent(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(activity: MainActivity)
    fun inject(activity: SettingActivity)
}