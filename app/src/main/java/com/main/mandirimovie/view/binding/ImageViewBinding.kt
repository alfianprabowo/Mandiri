package com.main.mandirimovie.view.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.main.mandirimovie.R
import com.main.mandirimovie.data.remote.Api
import com.squareup.picasso.Picasso
import com.squareup.picasso.Transformation


@BindingAdapter("bind_poster_path")
fun ImageView.bindPosterImageWithPicasso(path: String?) {
    if (path.isNullOrBlank()) {
        this.setImageResource(R.drawable.ic_baseline_image_24)
        return
    }
    val radius = 5
    val margin = 5

    Picasso.get().load(Api.getPosterUrl(path)).fit()
//        .transform(RoundedCornersTransformation(4, 1))
        .error(R.drawable.ic_baseline_image_24).into(this)
}

@BindingAdapter("bind_video_thumbnail")
fun ImageView.bindVideoThumbnailWithPicasso(youtubeId: String?) {
    if (youtubeId.isNullOrBlank()) {
        this.setImageResource(R.drawable.ic_baseline_image_24)
        return
    }
    Picasso.get().load(Api.getYoutubeImageUrl(youtubeId)).fit()
        .error(R.drawable.ic_baseline_image_24).into(this)
}