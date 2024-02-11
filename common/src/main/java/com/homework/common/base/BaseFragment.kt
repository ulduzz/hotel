package com.homework.common.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.viewbinding.ViewBinding
import com.homework.common.flowstate.Status
import com.homework.common.util.LoadingDialog
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch


typealias Inflate<T> = (LayoutInflater,ViewGroup?,Boolean) -> T
open class BaseFragment<B: ViewBinding>(private val inflate: Inflate<B>): Fragment() {
    private lateinit var loadingDialog : LoadingDialog
    private var _binding: ViewBinding?=null
    protected val binding : B get() = _binding as B
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     _binding= inflate.invoke(inflater,container,false)
        return _binding?.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadingDialog = LoadingDialog(requireActivity())
    }
    fun handleState(viewModel: BaseViewModel){
        lifecycleScope.launch {
            viewModel.state.collectLatest { state->
                state?.let {
                    when(it.status){
                        Status.SUCCESS -> showLoadingProgress(false)
                        Status.ERROR -> showLoadingProgress(false)
                        Status.LOADING -> showLoadingProgress(true)
                    }
                }

            }
        }

    }
    fun showLoadingProgress(isLoad: Boolean) {
        if(::loadingDialog.isInitialized){
            loadingDialog.apply {
                if(isLoad){
                    if(!isShowing&& isAdded){
                        show()
                    }
                }else{
                    dismiss()
                }
            }
        }

    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}