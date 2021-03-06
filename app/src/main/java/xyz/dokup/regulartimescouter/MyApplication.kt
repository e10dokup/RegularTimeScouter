package xyz.dokup.regulartimescouter

import android.app.Application
import com.jakewharton.threetenabp.AndroidThreeTen
import timber.log.Timber
import xyz.dokup.regulartimescouter.di.AppComponent
import xyz.dokup.regulartimescouter.di.AppModule
import xyz.dokup.regulartimescouter.di.DaggerAppComponent

/**
 * Created by e10dokup on 2017/07/02.
 */
class MyApplication : Application() {

    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.builder().appModule(AppModule(this)).build()
        component.inject(this)

        AndroidThreeTen.init(this)

        Timber.plant(Timber.DebugTree())
    }
}