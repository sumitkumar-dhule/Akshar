package com.electrodiligent.english.data

import com.electrodiligent.english.R
import com.electrodiligent.core.domain.model.CharacterQuestion

object NumberQuestionRepository {
    val list = getQuestionList().shuffled()

    private fun getQuestionList(): List<CharacterQuestion> {
        val questionList: MutableList<CharacterQuestion> = mutableListOf()
        val sounds = getSounds()

        for ((index, letter) in (0..20).withIndex()) {
            questionList.add(
                CharacterQuestion(
                    question = "Find Number",
                    audio = sounds[index],
                    correctAnswer = letter.toString(),
                    options = createOptions(letter.toString())
                )
            )
        }

        return questionList
    }

    private fun getSounds(): List<Int> {
        return listOf(
            R.raw.kevin_0,
            R.raw.kevin_1,
            R.raw.kevin_2,
            R.raw.kevin_3,
            R.raw.kevin_4,
            R.raw.kevin_5,
            R.raw.kevin_6,
            R.raw.kevin_7,
            R.raw.kevin_8,
            R.raw.kevin_9,
            R.raw.kevin_10,
            R.raw.kevin_11,
            R.raw.kevin_12,
            R.raw.kevin_13,
            R.raw.kevin_14,
            R.raw.kevin_15,
            R.raw.kevin_16,
            R.raw.kevin_17,
            R.raw.kevin_18,
            R.raw.kevin_19,
            R.raw.kevin_20
        )
    }

    private fun createOptions(correctAnswer: String): List<String> {
        val options: MutableList<String> = mutableListOf()
        options.add(correctAnswer)

        while (options.size < 9) {
            val randomOption = if (correctAnswer.toInt() > 20) {
                get10to90().random()
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
        for (letter in 0..20) {
            list.add(letter.toString())
        }
        return list
    }

    private fun get10to90(): List<String> {
        val list: MutableList<String> = mutableListOf()
        for (letter in 10..90) {
            list.add(letter.toString())
        }
        return list
    }
}