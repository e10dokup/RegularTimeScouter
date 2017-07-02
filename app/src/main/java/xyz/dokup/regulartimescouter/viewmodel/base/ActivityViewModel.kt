package xyz.dokup.regulartimescouter.viewmodel.base

/**
 * Created by e10dokup on 2017/07/02.
 */
abstract class ActivityViewModel {

    abstract fun onStart()

    abstract fun onResume()

    abstract fun onPause()

    abstract fun onStop()
}