package com.ts.copying_sutra_mvvm.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ts.copying_sutra_mvvm.data.QuoteRepository

@Suppress("UNCHECKED_CAST")
class QuotesViewModelFactory(private val quoteRepository: QuoteRepository) :
    ViewModelProvider.NewInstanceFactory() {


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quoteRepository) as T

    }

}


// このclassはViewModelから継承するrepository
//