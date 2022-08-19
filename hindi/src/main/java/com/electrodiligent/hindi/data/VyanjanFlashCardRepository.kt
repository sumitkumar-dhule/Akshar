package com.electrodiligent.hindi.data

import com.electrodiligent.core.domain.model.DisplayCharacter

object VyanjanFlashCardRepository {

    val list = getSwarList()

    private fun getSwarList(): List<DisplayCharacter> {
        val questionList: MutableList<DisplayCharacter> = mutableListOf()
//        val sounds = getSounds()
        for ((index, letter) in VyanjanRepository.list.withIndex()) {
            questionList.add(

                DisplayCharacter(
                    display = letter.display,
//                    audio = sounds[index]
                )

            )
        }

        return questionList
    }

}