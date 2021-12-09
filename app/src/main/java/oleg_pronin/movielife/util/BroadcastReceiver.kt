package oleg_pronin.movielife.util

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import android.net.NetworkInfo

import android.net.ConnectivityManager

class BroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(
            context,
            "Изменилось подключение к сети",
            Toast.LENGTH_SHORT
        ).show()
    }
}