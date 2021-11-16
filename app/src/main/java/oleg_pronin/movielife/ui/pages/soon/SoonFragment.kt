package oleg_pronin.movielife.ui.pages.soon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import oleg_pronin.movielife.databinding.FragmentSoonBinding
import oleg_pronin.movielife.domain.repository.MoviesRepoImpl

class SoonFragment : Fragment() {
    private var _binding: FragmentSoonBinding? = null
    private val binding get() = _binding!!

    private var adapter: SoonFragmentAdapter? = null

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

        val recyclerView: RecyclerView = binding.movieRecyclerViewSoon

        adapter = SoonFragmentAdapter().apply {
            setData(MoviesRepoImpl().getUpcomingMovies())
        }

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}