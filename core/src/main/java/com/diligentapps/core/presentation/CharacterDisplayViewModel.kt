package com.diligentapps.core.presentation

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.diligentapps.core.domain.model.DisplayCharacter
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class CharacterDisplayViewModel @Inject constructor(@ApplicationContext val context: Context): ViewModel() {

    var displayCharacters: List<DisplayCharacter> = listOf(DisplayCharacter())

    private var currentIndex: Int by mutableStateOf(0)

    var displayCharacterState: DisplayCharacter by mutableStateOf(displayCharacters[currentIndex])

    fun setup(){
        displayCharacterState = displayCharacters[currentIndex]
    }

    fun next() {

        if (currentIndex < displayCharacters.lastIndex) {
            currentIndex++
        }
        displayCharacterState = displayCharacters[currentIndex]

    }

    fun previous() {
        if (currentIndex > 1) {
            currentIndex--
        }
        displayCharacterState = displayCharacters[currentIndex]
    }

}