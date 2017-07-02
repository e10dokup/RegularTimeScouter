package xyz.dokup.regulartimescouter.di

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import dagger.Module
import dagger.Provides

/**
 * Created by e10dokup on 2017/07/02.
 */
@Module
class FragmentModule(val fragment: Fragment) {

    @Provides
    fun provideFragmentManager(): FragmentManager {
        return fragment.fragmentManager
    }

}