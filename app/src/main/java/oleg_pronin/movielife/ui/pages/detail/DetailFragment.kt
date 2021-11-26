package oleg_pronin.movielife.ui.pages.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import oleg_pronin.movielife.databinding.DetailFragmentBinding
import oleg_pronin.movielife.util.createSnackbarAndShow

class DetailFragment : Fragment() {
    private var _binding: DetailFragmentBinding? = null
    private val binding get() = _binding!!

    private val viewModel: DetailContract.ViewModal by viewModels<DetailViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DetailFragmentBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.getInt("id")?.let {
            // TODO: Временное id = it - 1
            viewModel.getDetailMovieById(it - 1).apply {
                binding.nameMovie.text = name
                binding.dateMovie.text = date
                binding.descMovie.text = description
            }

            view.createSnackbarAndShow(binding.nameMovie.text as String)
        }
    }
}