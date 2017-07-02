package xyz.dokup.regulartimescouter.viewmodel

import android.databinding.ObservableField
import xyz.dokup.regulartimescouter.viewmodel.base.ActivityViewModel
import javax.inject.Inject

/**
 * Created by e10dokup on 2017/07/02.
 */
class MainActivityViewModel @Inject constructor(): ActivityViewModel() {

    private val regularTimePower = ObservableField<String>()
    private val averageTime = ObservableField<String>()
    private val bestTime = ObservableField<String>()
    private val worstTime = ObservableField<String>()

    init {

    }

    override fun onStart() {
    }

    override fun onResume() {
    }

    override fun onPause() {
    }

    override fun onStop() {
    }
}