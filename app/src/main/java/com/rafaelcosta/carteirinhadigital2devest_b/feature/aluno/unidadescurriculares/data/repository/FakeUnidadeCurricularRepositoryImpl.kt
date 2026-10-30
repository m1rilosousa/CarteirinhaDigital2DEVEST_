package com.rafaelcosta.carteirinhadigital2devest_b.feature.aluno.unidadescurriculares.data.repository

import com.rafaelcosta.carteirinhadigital2devest_b.feature.aluno.unidadescurriculares.domain.model.UnidadeCurricular
import com.rafaelcosta.carteirinhadigital2devest_b.feature.aluno.unidadescurriculares.domain.repository.UnidadeCurricularRepository
import kotlinx.coroutines.delay

class FakeUnidadeCurricularRepositoryImpl : UnidadeCurricularRepository {

    override suspend fun listar(): Result<List<UnidadeCurricular>> {
        delay(500)
        return Result.success(
            listOf(
                UnidadeCurricular(
                    id = "1",
                    nome = "Desenvolvimento Mobile",
                    professor = "Carlos Silva",
                    nota1 = 9.0,
                    nota2 = 8.5,
                    media = 8.75,
                    faltas = 2
                ),
                UnidadeCurricular(
                    id = "2",
                    nome = "Banco de Dados",
                    professor = "Ana Maria",
                    nota1 = 8.0,
                    nota2 = 9.0,
                    media = 8.5,
                    faltas = 0
                ),
                UnidadeCurricular(
                    id = "3",
                    nome = "Programação Web",
                    professor = "Roberto Lima",
                    nota1 = 7.5,
                    nota2 = 8.0,
                    media = 7.75,
                    faltas = 4
                ),
                UnidadeCurricular(
                    id = "4",
                    nome = "Engenharia de Software",
                    professor = "Fernanda Costa",
                    nota1 = 9.5,
                    nota2 = 9.0,
                    media = 9.25,
                    faltas = 1
                )
            )
        )
    }
}
