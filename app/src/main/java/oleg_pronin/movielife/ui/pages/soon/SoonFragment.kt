package oleg_pronin.movielife.ui.pages.soon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import oleg_pronin.movielife.AppState
import oleg_pronin.movielife.R
import oleg_pronin.movielife.databinding.FragmentSoonBinding
import oleg_pronin.movielife.domain.entity.Movie
import oleg_pronin.movielife.ui.adapter.LargeMovieCardAdapter
import oleg_pronin.movielife.ui.adapter.SmallMovieCardAdapter
import oleg_pronin.movielife.ui.main.MainContract
import oleg_pronin.movielife.util.createSnackbarAndShow
import oleg_pronin.movielife.util.createSnackbarResAndShow

class SoonFragment : Fragment() {
    private var _binding: FragmentSoonBinding? = null
    private val binding get() = _binding!!

    private var adapter: LargeMovieCardAdapter? = null
    private val viewModel: SoonContract.ViewModel by viewModels<SoonViewModel>()

    private lateinit var recyclerView: RecyclerView
    private var progressBar: MainContract.ProgressBar? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSoonBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        progressBar = (activity as MainContract.ProgressBar)

        initRecyclerView()
        initViewModel(viewModel)

        viewModel.getSoonMovieList()
    }

    private fun initRecyclerView() {
        recyclerView = binding.recyclerViewSoon
        recyclerView.layoutManager = LinearLayoutManager(context)
    }

    private fun initViewModel(viewModel: SoonContract.ViewModel) {
        viewModel.soonMovieList.observe(this) { renderData(it) }
    }

    private fun renderData(appState: AppState) {
        when (appState) {
            is AppState.Success -> {
                adapter = LargeMovieCardAdapter().apply {
                    setData(appState.data as List<Movie>)
                }

                recyclerView.adapter = adapter

                progressBar?.showOrHide(false)
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

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}