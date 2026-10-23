package com.rafaelcosta.carteirinhadigital2devest_b.feature.professor

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

@Composable
fun HomeProfessorScreen(
    usuarioLogado: UsuarioLogado,
    onTurmasClick: () -> Unit,
    onUnidadesCurricularesClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement =
            Arrangement.spacedBy(24.dp)
    ) {
        Text(
            text = "Olá, ${usuarioLogado.nome}",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold
        )

        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceContainer
            )
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "Professor",
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    text = "Matrícula: ${usuarioLogado.matricula}"
                )

                Text(
                    text = "Acesse suas turmas e unidades curriculares."
                )
            }
        }

        NavigationButton(
            text = "Minhas Turmas",
            onClick = onTurmasClick,
            modifier = Modifier.fillMaxWidth()
        )

        NavigationButton(
            text = "Unidades Curriculares",
            onClick = onUnidadesCurricularesClick,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeProfessorPreview() {
    CarteirinhaDigital2DEVESTTheme {
        HomeProfessorScreen(
            usuarioLogado = UsuarioLogado(
                id = "2",
                nome = "Professor Modelo",
                matricula = "PROF20260001",
                perfil = PerfilAcesso.PROFESSOR,
                curso = "",
                turma = "",
                token = "token"
            ),
            onTurmasClick = {},
            onUnidadesCurricularesClick = {}
        )
    }
}