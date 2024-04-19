package com.rodrigoeo.screennavigationcompose.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.movableContentOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.rodrigoeo.screennavigationcompose.ui.theme.ScreenNavigationComposeTheme



@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SecondScreen(navController: NavController) {
    Scaffold (topBar = {
        TopAppBar(title = {
            Icon(imageVector = Icons.Filled.ArrowBack,
                contentDescription ="Arrow back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                })

            Text(text = "Perfil", modifier = Modifier.padding(horizontal = 42.dp))
        },
            colors = TopAppBarDefaults.topAppBarColors(MaterialTheme.colorScheme.secondaryContainer),

            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Filled.MoreVert, contentDescription = "more options")
                }
            }
        )

    }) {
        SecondBodyContent(navController)
    }
}

@Composable
fun SecondBodyContent(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Perfil")
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Volver a inicio")
        }

    }
}



