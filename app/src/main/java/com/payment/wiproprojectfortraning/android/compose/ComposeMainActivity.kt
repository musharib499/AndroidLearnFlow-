package com.payment.wiproprojectfortraning.android.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.payment.wiproprojectfortraning.android.compose.screen.ComposeMainScreen
import com.payment.wiproprojectfortraning.ui.theme.WiproProjectForTraningTheme

/** Compose - What is compose
 * - Jetpack compose is a modern toolkit for building native UI
 * - Developed by google
 * - Compose is allow us to build using kotlin in a declarative and reactive way
 * - UI build instead of XML we can use compose
 * - Compose provide annotation for composable function
 * - @Composable annotation is used to mark a function as a composable function
 * - Key features of compose
 * - 1. Declarative UI
 * - 2. Composition
 * - 3. Performance
 * - 4. UI Testing
 * - 5. UI Tooling
 * - 6. Interoperability with other frameworks
 * */

class ComposeMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WiproProjectForTraningTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                    .windowInsetsPadding(WindowInsets.systemBars),
                    color = MaterialTheme.colorScheme.background
                ){
                    ComposeMainScreen()

                }
            }
        }
    }
}