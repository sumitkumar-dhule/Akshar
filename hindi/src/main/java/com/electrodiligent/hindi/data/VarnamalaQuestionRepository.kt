package com.electrodiligent.hindi.data

import com.electrodiligent.core.R.raw.*
import com.electrodiligent.core.domain.model.CharacterQuestion

object VarnamalaQuestionRepository {
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
            find_a,
            find_b,
            find_c,
            find_d,
            find_e,
            find_f,
            find_g,
            find_h,
            find_i,
            find_j,
            find_k,
            find_l,
            find_m,
            find_n,
            find_o,
            find_p,
            find_q,
            find_r,
            find_s,
            find_t,
            find_u,
            find_v,
            find_w,
            find_x,
            find_y,
            find_z
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