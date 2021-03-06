package oleg_pronin.movielife.ui.pages.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import oleg_pronin.movielife.R
import oleg_pronin.movielife.databinding.FragmentMovieBinding
import oleg_pronin.movielife.ui.adapter.SmallMovieCardAdapter
import oleg_pronin.movielife.util.createSnackbarResAndShow

class MovieFragment : Fragment() {
    private var _binding: FragmentMovieBinding? = null
    private val binding get() = _binding!!

    private var adapter: SmallMovieCardAdapter? = null
    private val viewModel: MovieContract.ViewModel by viewModels<MovieViewModal>()

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMovieBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.createSnackbarResAndShow(R.string.movie)

        initRecyclerView()
        initViewModel(viewModel)

        viewModel.getMainMovieList()
    }

    private fun initRecyclerView() {
        recyclerView = binding.recyclerViewMovie
        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun initViewModel(viewModel: MovieContract.ViewModel) {
        viewModel.mainMovieList.observe(this) {
            adapter = SmallMovieCardAdapter().apply {
                setData(it)
            }

            recyclerView.adapter = adapter
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}