package xyz.dokup.regulartimescouter.view.activity

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import xyz.dokup.regulartimescouter.R
import xyz.dokup.regulartimescouter.databinding.ActivityMainBinding
import xyz.dokup.regulartimescouter.view.activity.base.BaseActivity
import xyz.dokup.regulartimescouter.viewmodel.MainActivityViewModel
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var viewModel: MainActivityViewModel

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        component.inject(this)
        bindViewModel(viewModel)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel

        setSupportActionBar(binding.toolbar)

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
}
