package xyz.dokup.regulartimescouter.di.provider

import android.content.Context
import xyz.dokup.regulartimescouter.model.OrmaDatabase

/**
 * Created by e10dokup on 2017/08/13.
 */
class OrmaProvider(context: Context) {

    val ormaDatabase: OrmaDatabase = OrmaDatabase.builder(context).build()

}