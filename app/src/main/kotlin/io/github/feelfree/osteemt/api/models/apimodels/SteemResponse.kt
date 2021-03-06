package io.github.feelfree.osteemt.api.models.apimodels

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

/**
 * SteemResponse is class which holds successful or failed response
 */
@JsonIgnoreProperties(ignoreUnknown = true)
data class SteemResponse<out V : Any>(
        @JsonProperty("data")
        val data : V?,

        @JsonProperty("error")
        val error : SteemError?
)