package xyz.dokup.regulartimescouter.view.activity

import android.app.TimePickerDialog
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.widget.TimePicker
import xyz.dokup.regulartimescouter.R
import xyz.dokup.regulartimescouter.databinding.ActivitySettingBinding
import xyz.dokup.regulartimescouter.view.activity.base.BaseActivity
import xyz.dokup.regulartimescouter.viewmodel.MainActivityViewModel
import xyz.dokup.regulartimescouter.viewmodel.SettingActivityViewModel
import javax.inject.Inject

class SettingActivity : BaseActivity(), TimePickerDialog.OnTimeSetListener {

    @Inject
    lateinit var viewModel: SettingActivityViewModel

    private lateinit var binding: ActivitySettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        component.inject(this)
        bindViewModel(viewModel)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_setting)
        binding.viewModel = viewModel
        initBackToolbar(binding.toolbar)

    }

    override fun onTimeSet(p0: TimePicker?, p1: Int, p2: Int) {

    }
}
