package com.electrodiligent.marathi.data

import com.electrodiligent.core.domain.model.CharacterQuestion

object NumberQuestionRepository {
    val list = getQuestionList().shuffled()

    private fun getQuestionList(): List<CharacterQuestion> {
        val questionList: MutableList<CharacterQuestion> = mutableListOf()

        for (item in NumberRepository.listUpTo20) {
            questionList.add(
                CharacterQuestion(
                    question = "संख्या शोधा",
                    audio = item.audio,
                    correctAnswer = item.countString,
                    options = createOptions(item.countString)
                )
            )
        }

        return questionList
    }


    private fun createOptions(correctAnswer: String): List<String> {
        val options: MutableList<String> = mutableListOf()
        options.add(correctAnswer)

        while (options.size < 9) {
            val randomOption = if (correctAnswer.toInt() > 20) {
              //  get10to90().random()
                //TODO:: Fix following
                get0to20().random()

            } else {
                get0to20().random()
            }
            if (randomOption != correctAnswer) {
                options.add(randomOption)
            }
        }

        return options.shuffled()
    }

    private fun get0to20(): List<String> {
        val list: MutableList<String> = mutableListOf()
        for (letter in NumberRepository.listUpTo20) {
            list.add(letter.countString)
        }
        return list
    }

}