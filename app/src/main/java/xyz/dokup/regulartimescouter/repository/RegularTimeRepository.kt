package xyz.dokup.regulartimescouter.repository

import xyz.dokup.regulartimescouter.datasource.RegularTimeLocalDataSource
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by e10dokup on 2017/08/13.
 */
@Singleton
class RegularTimeRepository @Inject constructor(
        private val localDataSource: RegularTimeLocalDataSource
) {

    fun getTarget() : Int {
        return localDataSource.getTarget()
    }

    fun setTarget(target: Int) {
        return localDataSource.setTarget(target)
    }

}