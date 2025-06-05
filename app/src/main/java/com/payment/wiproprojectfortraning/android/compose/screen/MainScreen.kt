package com.payment.wiproprojectfortraning.android.compose.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ComposeMainScreen() {
    var name by remember {mutableStateOf("")}
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            "Welcome to compose", style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(10.dp),
            color = Color.Blue
        );
        Text("Welcome to compose1",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(10.dp),
            color = Color.Red
        );
        Text("Welcome to compose2",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(10.dp));
        Text("Welcome to compose3", style = MaterialTheme.typography.bodyMedium);
        Text("Welcome to compose4", style = MaterialTheme.typography.bodySmall);
        Text("Welcome to compose5", style = MaterialTheme.typography.titleLarge);
        Text("Welcome to compose7", style = MaterialTheme.typography.titleLarge);
        Text("Welcome to compose8", style = MaterialTheme.typography.titleLarge);
        Spacer(modifier = Modifier.padding(10.dp))
        Text(name, style = MaterialTheme.typography.titleLarge);


    }
}

@Preview
@Composable
fun ComposeMainScreenPreview() {
    ComposeMainScreen()
}