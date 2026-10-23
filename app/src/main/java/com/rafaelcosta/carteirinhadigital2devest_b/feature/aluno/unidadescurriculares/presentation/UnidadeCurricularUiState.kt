package com.rafaelcosta.carteirinhadigital2devest_b.feature.aluno.unidadescurriculares.presentation


data class UnidadeCurricularUiState(
    val isLoading: Boolean = false,
    val unidades: List<UnidadeCurricular> = emptyList(),
    val errorMessage: String? = null
)