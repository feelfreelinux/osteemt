package io.github.feelfree.osteemt.api.models.viewmodels

import android.os.Parcelable
import io.github.feelfree.osteemt.api.models.apimodels.JsonMetadata

class Post(
        val id : Int,
        val author : String,
        val permlink : String,
        val category : String,
        val createdAt : String,
        val title : String,
        val body : String,
        val jsonMetadata : JsonMetadata,
        val pendingPayoutValue : String,
        val children : Int,
        val netVotes : Int
)