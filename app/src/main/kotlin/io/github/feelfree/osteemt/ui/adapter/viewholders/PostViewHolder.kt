package io.github.feelfree.osteemt.ui.adapter.viewholders

import android.support.v7.widget.RecyclerView
import android.view.View
import io.github.feelfree.osteemt.api.models.viewmodels.Post
import io.github.feelfree.osteemt.utils.isVisible
import io.github.feelfree.osteemt.utils.loadImage
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.post_list_item.*

class PostViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {
    fun bindView(post : Post) {
        // @TODO write some real code here
        titleTextView.text = post.title
        authorTextView.text = post.author
        body.text = post.body
        votes.text = " • ${post.netVotes} votes • ${post.children} comments"
        payout.text = post.pendingPayoutValue
        tagDataTextView.text = "in ${post.category} • ${post.createdAt}"
        profilePicture.loadImage(post.avatarUrl)
        previewImage.isVisible = post.thumbnail == null
        if (post.thumbnail != null) {
            previewImage.loadImage(post.thumbnail)
        }
    }
}