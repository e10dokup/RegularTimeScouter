package xyz.dokup.regulartimescouter.di

import android.support.v7.app.AppCompatActivity
import dagger.Module
import dagger.Provides

/**
 * Created by e10dokup on 2017/07/02.
 */
@Module
class ActivityModule(val activity: AppCompatActivity) {

    @Provides
    fun provideActivity(): AppCompatActivity {
        return activity
    }

}