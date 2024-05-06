package com.example.firebase_mptyview

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.snapshots.Snapshot
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.firebase_mptyview.ui.theme.Firebase_mptyviewTheme

class tasks : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Firebase_mptyviewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                  //  TaskListApp(LocalContext.current)
                }
            }
        }
    }
}

//@Composable
//fun TaskListApp(context: Context, taskList:SnapshotStateList<>) {

//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    Firebase_mptyviewTheme {
       // TaskListApp(LocalContext.current)
    }
}