package com.electrodiligent.marathi.data

import com.electrodiligent.core.domain.model.CharacterQuestion
import com.electrodiligent.core.domain.model.DisplayCharacter

object VarnamalaQuestionRepository {
    val list = getQuestionList().shuffled()

    private fun getQuestionList(): List<CharacterQuestion> {
        val questionList: MutableList<CharacterQuestion> = mutableListOf()

        for (letter in getAllSwarAndVyanjan()) {
            questionList.add(
                CharacterQuestion(
                    question = "अक्षर शोधा",
                    correctAnswer = letter.display,
                    audio = letter.audio,
                    options = createOptions(letter.display)
                )
            )
        }

        return questionList
    }

    private fun createOptions(correctAnswer: String): List<String> {
        val options: MutableList<String> = mutableListOf()
        options.add(correctAnswer)

        while (options.size < 9) {
            val randomOption = getAllSwarAndVyanjan().random()
            if (randomOption.display != correctAnswer) {
                options.add(randomOption.display)
            }
        }

        return options.shuffled()
    }

    private fun getAllSwarAndVyanjan(): List<DisplayCharacter> {
        val swarAndVyanjan = mutableListOf<DisplayCharacter>()
        swarAndVyanjan.addAll(SwarFlashCardRepository.list)
        swarAndVyanjan.addAll(VyanjanFlashCardRepository.list)
        return swarAndVyanjan
    }
}