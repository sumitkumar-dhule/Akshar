package com.electrodiligent.hindi.data

import com.electrodiligent.core.domain.model.DisplayCharacter

object VyanjanFlashCardRepository {

    val list = getSwarList()

    private fun getSwarList(): List<DisplayCharacter> {
        val questionList: MutableList<DisplayCharacter> = mutableListOf()
        for (letter in VyanjanRepository.list) {
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