package xyz.dokup.regulartimescouter.view.activity.base

import android.support.annotation.IdRes
import android.support.annotation.LayoutRes
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import xyz.dokup.regulartimescouter.MyApplication
import xyz.dokup.regulartimescouter.di.ActivityModule
import xyz.dokup.regulartimescouter.viewmodel.base.ActivityViewModel


/**
 * Created by e10dokup on 2017/07/02.
 */
abstract class BaseActivity: AppCompatActivity() {

    val component by lazy {
        (application as MyApplication).component.plus(ActivityModule(this))
    }

    private lateinit var viewModel : ActivityViewModel

    protected fun bindViewModel(viewModel: ActivityViewModel) {
        this.viewModel = viewModel
    }

    override fun onStart() {
        super.onStart()
        viewModel.onStart()
    }

    override fun onResume() {
        super.onResume()
        viewModel.onResume()
    }

    override fun onPause() {
        super.onPause()
        viewModel.onPause()
    }

    override fun onStop() {
        super.onStop()
        viewModel.onStop()
    }

    fun replaceFragment(fragment: Fragment, @IdRes @LayoutRes layoutResId: Int) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(layoutResId, fragment, fragment::class.java.simpleName)
        ft.commit()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

    fun initBackToolbar(toolbar: Toolbar) {
        setSupportActionBar(toolbar)

        val bar = supportActionBar
        if (bar != null) {
            bar.title = toolbar.title
            bar.setDisplayHomeAsUpEnabled(true)
            bar.setDisplayShowHomeEnabled(true)
            bar.setDisplayShowTitleEnabled(true)
            bar.setHomeButtonEnabled(true)
        }
    }
}