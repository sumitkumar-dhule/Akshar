package com.electrodiligent.hindi.data

import com.electrodiligent.core.domain.model.DisplayCharacter

object SwarFlashCardRepository {

    val list = getSwarList()

    private fun getSwarList(): List<DisplayCharacter> {
        val questionList: MutableList<DisplayCharacter> = mutableListOf()
        for (letter in SwarRepository.list) {
            questionList.add(

                DisplayCharacter(
                    display = letter.display,
                    audio = letter.audio
                )

            )
        }

        return questionList
    }

}