package oleg_pronin.movielife.ui.main

class MainContract {
    interface ProgressBar {
        fun showOrHide(show: Boolean)
    }

    interface NavController {
        fun setTitle(title: String)
    }
}