package dev.jorik.navigationexperiments

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import kotlinx.serialization.Serializable

@Serializable
object FieldDestination

@Composable
fun FieldScreen(
    navController :NavController
) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        val fieldValue = remember { mutableStateOf("") }
        TextField(
            value = fieldValue.value,
            onValueChange = { fieldValue.value = it },
            placeholder = { Text("Value") },
            modifier = Modifier.fillMaxWidth(0.8f)
        )
        Button(onClick = navController::popBackStack) {
            Text("Save")
        }
    }
}