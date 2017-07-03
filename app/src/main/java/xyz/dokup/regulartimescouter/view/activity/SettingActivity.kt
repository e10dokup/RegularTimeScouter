package xyz.dokup.regulartimescouter.view.activity

import android.app.TimePickerDialog
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TimePicker
import xyz.dokup.regulartimescouter.R
import xyz.dokup.regulartimescouter.databinding.ActivitySettingBinding
import xyz.dokup.regulartimescouter.view.activity.base.BaseActivity
import xyz.dokup.regulartimescouter.viewmodel.MainActivityViewModel
import javax.inject.Inject

class SettingActivity : BaseActivity(), TimePickerDialog.OnTimeSetListener {

    @Inject
    lateinit var viewModel: MainActivityViewModel

    private lateinit var binding: ActivitySettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        component.inject(this)
        bindViewModel(viewModel)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_setting)
//        binding.viewModel = viewModel

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_settings -> viewModel.onSelectSettingMenu()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onTimeSet(p0: TimePicker?, p1: Int, p2: Int) {

    }
}
