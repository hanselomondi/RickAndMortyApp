package com.example.network

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.network.character.models.domain.Character

@Composable
fun TestFile(character: Character, modifier: Modifier = Modifier) {
    val characterStatus = character.status
    val characterGender = character.gender

    Column(modifier = modifier) {
        Text(
            text = "Hello ${character.name}!",
            modifier = modifier
        )
        Text(
            text = "Gender: ${characterGender.gender}",
            modifier = modifier
        )
        Text(
            text = "Status: ${characterStatus.status}",
            modifier = modifier
        )
        Text(
            text = "Species: ${character.species}",
            modifier = modifier
        )
    }
}