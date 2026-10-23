package com.rafaelcosta.carteirinhadigital2devest_b.app.di

import com.rafaelcosta.carteirinhadigital2devest_b.feature.aluno.unidadescurriculares.domain.repository.UnidadeCurricularRepository
import com.rafaelcosta.carteirinhadigital2devest_b.core.auth.SessionTokenStore
import com.rafaelcosta.carteirinhadigital2devest_b.feature.login.domain.repository.LoginRepository

interface AppContainer {
    val sessionTokenStore: SessionTokenStore
    val loginRepository: LoginRepository
    val unidadeCurricularRepository: UnidadeCurricularRepository
}


