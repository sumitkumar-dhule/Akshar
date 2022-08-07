package com.electrodiligent.core.presentation.alphabate

import android.content.Context
import android.media.MediaPlayer
import androidx.lifecycle.ViewModel
import com.electrodiligent.core.R
import com.electrodiligent.core.domain.model.DisplayCharacter
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class AlphabetFlashcardViewModel @Inject constructor(@ApplicationContext val context: Context) :
    ViewModel() {

    private var mediaPlayer = MediaPlayer.create(context, R.raw.beep)

    fun playSound(item: DisplayCharacter) {
        mediaPlayer.release()
        mediaPlayer = MediaPlayer.create(context, item.audio)
        mediaPlayer.start()
    }

}