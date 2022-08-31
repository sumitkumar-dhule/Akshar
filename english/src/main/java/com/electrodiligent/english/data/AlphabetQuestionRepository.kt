package com.electrodiligent.english.data

import com.electrodiligent.english.R.raw.*
import com.electrodiligent.core.domain.model.CharacterQuestion

object AlphabetQuestionRepository {
    val list = getQuestionList().shuffled()

    private fun getQuestionList(): List<CharacterQuestion> {
        val questionList: MutableList<CharacterQuestion> = mutableListOf()
        val sounds = getSounds()
        for ((index, letter) in ('A'..'Z').withIndex()) {
            questionList.add(
                CharacterQuestion(
                    correctAnswer = letter.toString(),
                    audio = sounds[index],
                    options = createOptions(letter.toString())
                )
            )
        }

        return questionList
    }

    private fun getSounds(): List<Int> {
        return listOf(
            kevin_a,
            kevin_b,
            kevin_c,
            kevin_d,
            kevin_e,
            kevin_f,
            kevin_g,
            kevin_h,
            kevin_i,
            kevin_j,
            kevin_k,
            kevin_l,
            kevin_m,
            kevin_n,
            kevin_o,
            kevin_p,
            kevin_q,
            kevin_r,
            kevin_s,
            kevin_t,
            kevin_u,
            kevin_v,
            kevin_w,
            kevin_x,
            kevin_y,
            kevin_z
        )
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