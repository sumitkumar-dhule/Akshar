package com.electrodiligent.hindi.data

import com.electrodiligent.core.R
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
            R.raw.find_0,
            R.raw.find_1,
            R.raw.find_2,
            R.raw.find_3,
            R.raw.find_4,
            R.raw.find_5,
            R.raw.find_6,
            R.raw.find_7,
            R.raw.find_8,
            R.raw.find_9,
            R.raw.find_10,
            R.raw.find_11,
            R.raw.find_12,
            R.raw.find_13,
            R.raw.find_14,
            R.raw.find_15,
            R.raw.find_16,
            R.raw.find_17,
            R.raw.find_18,
            R.raw.find_19,
            R.raw.find_20
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