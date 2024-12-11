import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App(viewModel: EjemploViewModel) {
    MaterialTheme {
        Surface {
            Column {
                EpisodiosCounter()
                WellnessTaskList(
                    listaItems = viewModel.tasks, // Pasamos la lista de tareas desde el ViewModel
                    onCheckedTask = { task, checked ->
                        viewModel.changeTaskCheked(task, checked)
                    },
                    onCloseTask = { task ->
                        viewModel.remove(task)
                    }
                )
            }

        }
    }
}

fun main() = application {
    val viewModel = EjemploViewModel()
    Window(onCloseRequest = ::exitApplication) {
        App(viewModel)
    }
}
