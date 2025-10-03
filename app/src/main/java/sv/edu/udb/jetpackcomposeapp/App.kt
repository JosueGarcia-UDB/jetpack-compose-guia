package sv.edu.udb.jetpackcomposeapp
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import sv.edu.udb.jetpackcomposeapp.navigation.AppNavHost

@Composable
fun ComposeCarrerasApp() {
    val navController = rememberNavController()
    MaterialTheme {
        AppNavHost(navController = navController)
    }
}