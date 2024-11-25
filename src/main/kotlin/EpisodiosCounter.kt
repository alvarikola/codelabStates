import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable

@Composable
fun EpisodiosCounter() {
    var episodiosContador by rememberSaveable() { mutableStateOf(0) }
    var mostrarTarea by remember { mutableStateOf(false) }
    Column {
        if (episodiosContador > 0){
            if (mostrarTarea){
                WellnessTaskItem("Tienes que verte los episopdios de DanDaDan profe", onClose = { mostrarTarea = false })
            }
            val episodiosTexto = if (episodiosContador == 1 ) "episodio" else "episodios"
            Text("Te has visto ${episodiosContador} ${episodiosTexto} de DanDaDan")
        }
        Row {
            Button(
                onClick = {
                    episodiosContador++
                    mostrarTarea = true
                }
            ) {
                Text("Ver episodio")
            }
            Button(
                onClick = {
                    episodiosContador = 0
                }
            ) {
                Text("Reiniciar contador")
            }
        }
    }
}