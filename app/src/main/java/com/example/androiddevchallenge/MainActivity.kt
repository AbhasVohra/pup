/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.data.FakePuppies
import com.example.androiddevchallenge.ui.screen.PupDetails
import com.example.androiddevchallenge.ui.screen.PupList
import com.example.androiddevchallenge.ui.theme.MyTheme
import androidx.navigation.compose.navigate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MyApp()
            }
        }
    }
}

// Start building your app here!
@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Navigation.PupList.title) {
        composable(Navigation.PupList.title) {
            PupList(
                pupList = FakePuppies,
                navigateToDetailsScreen = { pet ->
                    navController.navigate(Navigation.Details.title + "/${pet.id}")
                })
        }
        composable(Navigation.Details.title + "/{id}") { backStackEntry ->
            val petId = backStackEntry.arguments?.getString("id")
            val doggo = FakePuppies.find { it.id == petId }
                ?: throw IllegalStateException("Doggo not found")
            PupDetails(
                pet = doggo,
                navigateBack = { navController.popBackStack() }
            )
        }
    }
//    Surface(color = MaterialTheme.colors.background) {
//        PupList()
//    }
}


    sealed class Navigation(val title: String) {
        object PupList : Navigation("PupList")
        object Details : Navigation("Details")
    }


//@Preview("Light Theme", widthDp = 360, heightDp = 640)
//@Composable
//fun LightPreview() {
//    MyTheme {
//        MyApp()
//    }
//}
//
//@Preview("Dark Theme", widthDp = 360, heightDp = 640)
//@Composable
//fun DarkPreview() {
//    MyTheme(darkTheme = true) {
//        MyApp()
//    }
//}
