package xyz.dokup.regulartimescouter.view.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import xyz.dokup.regulartimescouter.R
import xyz.dokup.regulartimescouter.databinding.ActivityMainBinding
import xyz.dokup.regulartimescouter.viewmodel.MainActivityViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainActivityViewModel

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }
}
