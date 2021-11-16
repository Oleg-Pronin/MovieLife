package oleg_pronin.movielife.ui.pages.soon

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import oleg_pronin.movielife.databinding.MovieItemLargeCardBinding
import oleg_pronin.movielife.domain.entity.Movie

class SoonFragmentAdapter : RecyclerView.Adapter<SoonFragmentAdapter.ViewHolder>() {
    private var movieData: List<Movie> = listOf()

    @SuppressLint("NotifyDataSetChanged")
    fun setData(data: List<Movie>) {
        movieData = data
        notifyDataSetChanged()
    }

    inner class ViewHolder(private val binding: MovieItemLargeCardBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(movie: Movie) = with(binding) {
            nameMovie.text = movie.name
            descMovie.text = movie.description
            dateMovie.text = movie.date.toString()

            cardView.setOnClickListener {
                Log.d("@@@@", "Click {${movie.id}}")
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            MovieItemLargeCardBinding.inflate(
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