package com.electrodiligent.english.data

import com.electrodiligent.core.domain.model.AlphabetQuestion

object AlphabetQuestionRepository {
    val list = getQuestionList()

    private fun getQuestionList(): List<AlphabetQuestion> {
        var questionList: MutableList<AlphabetQuestion> = mutableListOf()

        for (letter in 'A'..'Z') {
            questionList.add(
                AlphabetQuestion(
                    correctAnswer = letter.toString(),
                    options = createOptions(letter.toString())
                )
            )
        }

        return questionList
    }

    private fun createOptions(correctAnswer: String): List<String> {
        val options: MutableList<String> = mutableListOf()
        options.add(correctAnswer)

        while (options.size < 9) {
            val randomOption = getAtoZ().random()
            if (randomOption != correctAnswer) {
                options.add(randomOption)
            }
        }

        return options.shuffled()
    }

    private fun getAtoZ(): List<String> {
        val list: MutableList<String> = mutableListOf()
        for (letter in 'A'..'Z') {
            list.add(letter.toString())
        }
        return list
    }
}