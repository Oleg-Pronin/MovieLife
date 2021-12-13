package oleg_pronin.movielife.ui.pages.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import oleg_pronin.movielife.AppState
import oleg_pronin.movielife.databinding.FragmentDetailBinding
import oleg_pronin.movielife.domain.entity.Movie
import oleg_pronin.movielife.ui.main.MainContract
import oleg_pronin.movielife.util.createSnackbarAndShow
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    private val viewModel: DetailContract.ViewModal by viewModels<DetailViewModel>()
    private var progressBar: MainContract.ProgressBar? = null
    private var navController: MainContract.NavController? = null

    private var dateFormat = DateTimeFormatter.ofPattern("d MMMM yyyy")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        progressBar = activity as MainContract.ProgressBar
        navController = activity as MainContract.NavController

        initViewModel(viewModel)

        arguments?.getInt("id")?.let {
            viewModel.setDetailMovieById(it)
        }
    }

    private fun initViewModel(viewModel: DetailContract.ViewModal) {
        viewModel.detailMovie.observe(this) { renderData(it) }
    }

    private fun renderData(appState: AppState) {
        when (appState) {
            is AppState.Success -> {
                val movie = appState.data as Movie

                binding.nameMovie.text = movie.name
                binding.dateMovie.text = LocalDate.parse(movie.date).format(dateFormat)
                binding.descMovie.text = movie.description

                progressBar?.showOrHide(false)
                navController?.setTitle(movie.name)
            }
            is AppState.Loading -> {
                progressBar?.showOrHide(true)
            }
            is AppState.Error -> {
                progressBar?.showOrHide(false)
                appState.error.message?.let { view?.createSnackbarAndShow(it) }
            }
        }
    }
}