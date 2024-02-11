package com.homework.common.base

import androidx.lifecycle.ViewModel
import com.homework.common.flowstate.State
import kotlinx.coroutines.flow.MutableStateFlow

open class BaseViewModel: ViewModel() {
    val state: MutableStateFlow<State?> = MutableStateFlow(null)
}