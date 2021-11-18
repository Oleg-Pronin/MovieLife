package oleg_pronin.movielife.ui.pages.soon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import oleg_pronin.movielife.databinding.FragmentSoonBinding
import oleg_pronin.movielife.ui.adapter.LargeMovieCardAdapter

class SoonFragment : Fragment() {
    private var _binding: FragmentSoonBinding? = null
    private val binding get() = _binding!!

    private var adapter: LargeMovieCardAdapter? = null
    private val viewModel: SoonContract.ViewModel by viewModels<SoonViewModel>()

    private lateinit var recyclerView: RecyclerView

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

        initRecyclerView()
        initViewModel(viewModel)

        viewModel.getSoonMovieList()
    }

    private fun initRecyclerView() {
        recyclerView = binding.recyclerViewSoon
        recyclerView.layoutManager = LinearLayoutManager(context)
    }

    private fun initViewModel(viewModel: SoonContract.ViewModel) {
        viewModel.soonMovieList.observe(this) {
            adapter = LargeMovieCardAdapter().apply {
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