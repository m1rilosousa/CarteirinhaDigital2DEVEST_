package com.rafaelcosta.carteirinhadigital2devest_b.feature.aluno.unidadescurriculares.presentation.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.rafaelcosta.carteirinhadigital2devest_b.feature.aluno.unidadescurriculares.presentation.UnidadeCurricularViewModel

@Composable
fun UnidadeCurricularScreen(
    modifier: Modifier = Modifier,
    viewModel: UnidadeCurricularViewModel
) {

    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    val errorMessage = uiState.errorMessage

    LaunchedEffect(Unit) {
        viewModel.carregar()
    }

    when {
        uiState.isLoading -> {
            Box(
                modifier = modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        }

        errorMessage != null -> {
            Column(
                modifier = modifier
                    .fillMaxSize()
                    .padding(24.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = errorMessage,
                    color = MaterialTheme.colorScheme.error
                )
                Button(
                    modifier = Modifier
                        .padding(top = 16.dp),
                    onClick = {
                        viewModel.carregar()
                    }
                ) {
                    Text("Tentar novamente")
                }
            }
        }

        uiState.unidades.isEmpty() -> {
            Box(
                modifier = modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text("Nenhuma unidade curricular encontrada.")
            }
        }

        else -> {
            LazyColumn(
                modifier = modifier
                    .fillMaxSize()
                    .padding(
                        horizontal = 16.dp,
                        vertical = 12.dp
                    ),
                verticalArrangement = Arrangement
                    .spacedBy(12.dp)
            ) {
                items(
                    items = uiState.unidades,
                    key = { it.id }
                ) { unidadeCurricular ->
                    UnidadeCurricularCard(
                        unidadeCurricular = unidadeCurricular
                    )
                }
            }
        }
    }
}