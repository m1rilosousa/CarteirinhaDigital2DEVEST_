package com.rafaelcosta.carteirinhadigital2devest_b.feature.aluno.unidadescurriculares.presentation.factory

class UnidadeCurricularViewModelFactory(
    private val repository:UnidadeCurricularRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(UnidadeCurricularViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return UnidadeCurricularViewModel(repository = repository) as T
        }
        throw IllegalArgumentException("ViewModel desconhecido: ${modelClass.name}")
    }
}