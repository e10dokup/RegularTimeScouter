package xyz.dokup.regulartimescouter.di

import dagger.Component
import xyz.dokup.regulartimescouter.MyApplication
import javax.inject.Singleton

/**
 * Created by e10dokup on 2017/07/02.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun inject(application: MyApplication)

    fun plus(module: ActivityModule): ActivityComponent
}