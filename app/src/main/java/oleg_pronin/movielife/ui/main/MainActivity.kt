package oleg_pronin.movielife.ui.main

import android.content.IntentFilter
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import oleg_pronin.movielife.R
import oleg_pronin.movielife.databinding.ActivityMainBinding
import oleg_pronin.movielife.util.BroadcastReceiver

class MainActivity : AppCompatActivity(), MainContract.ProgressBar, MainContract.NavController {
    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        initNavigation()
        initReceiver()
    }

    private fun initReceiver() {
        registerReceiver(
            BroadcastReceiver(),
            IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        )
    }

    private fun getNavController(): NavController {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        return navHostFragment.navController
    }

    private fun initNavigation() {
        val navController = getNavController()

        appBarConfiguration = AppBarConfiguration(navController.graph)

        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.bottomNavigation.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return getNavController().navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun showOrHide(show: Boolean) {
        binding.progressBar.isVisible = show
        binding.navHostFragment.isVisible = !show
    }

    override fun setTitle(title: String) {
        supportActionBar?.title = title
    }
}