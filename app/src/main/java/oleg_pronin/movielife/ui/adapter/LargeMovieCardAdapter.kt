package oleg_pronin.movielife.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import oleg_pronin.movielife.R
import oleg_pronin.movielife.databinding.LargeCardItemMovieBinding
import oleg_pronin.movielife.domain.entity.Movie

class LargeMovieCardAdapter : RecyclerView.Adapter<LargeMovieCardAdapter.ViewHolder>() {
    private var movieData: List<Movie> = listOf()

    @SuppressLint("NotifyDataSetChanged")
    fun setData(data: List<Movie>) {
        movieData = data
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: LargeCardItemMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(movie: Movie) = with(binding) {
            nameMovie.text = movie.name
            descMovie.text = movie.description
            dateMovie.text = movie.date.toString()

            cardView.setOnClickListener {
//                Navigation.createNavigateOnClickListener(
//                    R.id.action_soon_fragment_to_detailFragment,
//                    bundleOf("id" to movie.id)
//                )
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LargeCardItemMovieBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(movieData[position])
    }

    override fun getItemCount(): Int = movieData.size
}