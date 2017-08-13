package xyz.dokup.regulartimescouter.di

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import xyz.dokup.regulartimescouter.constant.PrefKeys
import xyz.dokup.regulartimescouter.di.provider.OrmaProvider
import javax.inject.Singleton

/**
 * Created by e10dokup on 2017/07/02.
 */
@Module
class AppModule(private val context: Context) {

    @Provides
    fun provideContext(): Context {
        return context
    }

    @Singleton
    @Provides
    fun provideOrmaDatabase(context: Context): OrmaProvider {
        return OrmaProvider(context)
    }

    @Singleton
    @Provides
    fun provideSharedPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(PrefKeys.KEY_PREF, Context.MODE_PRIVATE)
    }
}