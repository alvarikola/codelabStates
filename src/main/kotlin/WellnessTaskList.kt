import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.modifier.modifierLocalMapOf


//data class WellnessTask(val id: Int, val label: String)

@Composable
fun WellnessTaskList(
    listaItems: List<WellnessTask>,
    onCheckedTask(),
    onCloseTask()
) {
    LazyColumn (
        state = rememberLazyListState()
    ){
        items(listaItems) {
            WellnessTaskItem(it.label, {})
        }
    }
}