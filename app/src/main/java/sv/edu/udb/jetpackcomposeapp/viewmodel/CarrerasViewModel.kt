package sv.edu.udb.jetpackcomposeapp.viewmodel
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import sv.edu.udb.jetpackcomposeapp.data.SampleData
import sv.edu.udb.jetpackcomposeapp.model.Materia

class CarrerasViewModel: ViewModel() {

    private val _carreras = mutableStateOf(SampleData().sampleCarreras)
    val carreras: State<Map<String, List<Materia>>> = _carreras

    fun buscarMateriasPorCodigo (codigo: String): Materia? {
        return carreras.value.values.flatten().find { it.codigo == codigo }
    }
}