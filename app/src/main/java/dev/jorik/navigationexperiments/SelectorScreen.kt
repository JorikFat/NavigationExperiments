package dev.jorik.navigationexperiments

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.serialization.Serializable

@Serializable
object SelectorDestination

@Composable
fun SelectorScreen(
    navController: NavController
) {

    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        ValueRow("Try1", ""){ navController.navigate(FieldDestination) }
        ValueRow("Try2", ""){ navController.navigate(FieldDestination) }
        ValueRow("Try3", ""){ navController.navigate(FieldDestination) }
    }
}

@Composable
fun ValueRow(
    caption: String,
    value: String,
    callback: () -> Unit,
) {
    Row(
        modifier = Modifier.fillMaxWidth(0.8f)
    ) {
        Button(onClick = callback) { Text(caption) }
        Spacer(modifier = Modifier.width(16.dp))
        Text(value)
    }
}