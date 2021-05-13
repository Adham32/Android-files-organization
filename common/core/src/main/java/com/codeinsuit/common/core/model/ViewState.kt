package com.codeinsuit.common.core.model

import androidx.annotation.StringRes

sealed class ViewState {
    data class Success<out T>(val data: T) : ViewState()
    object Loading : ViewState()
    data class Error(
        val message: String? = null,
        @StringRes val messageRes: Int? = null
    ) : ViewState()
}