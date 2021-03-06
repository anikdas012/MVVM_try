package anikdas012.anikdas.tk.mvvm_try.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import anikdas012.anikdas.tk.mvvm_try.data.QuoteRepository

/**
 * Created by anikdas012 on 2/20/2019
 */
class QuotesViewModelFactory(private val quoteRepository: QuoteRepository): ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quoteRepository) as T
    }
}