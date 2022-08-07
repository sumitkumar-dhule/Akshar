package com.electrodiligent.english.data

import com.electrodiligent.core.R.raw.*
import com.electrodiligent.core.domain.model.DisplayCharacter

object AlphabetFlashCardRepository {
    val list = getQuestionList()

    private fun getQuestionList(): List<DisplayCharacter> {
        val questionList: MutableList<DisplayCharacter> = mutableListOf()
        val sounds = getSounds()
        for ((index, letter) in ('A'..'Z').withIndex()) {
            questionList.add(

                DisplayCharacter(
                    display = letter.toString(),
                    subtitle = letter.lowercase(),
                    audio = sounds[index]
                )

            )
        }

        return questionList
    }

    private fun getSounds(): List<Int> {
        return listOf(
            say_a,
            say_b,
            say_c,
            say_d,
            say_e,
            say_f,
            say_g,
            say_h,
            say_i,
            say_j,
            say_k,
            say_l,
            say_m,
            say_n,
            say_o,
            say_p,
            say_q,
            say_r,
            say_s,
            say_t,
            say_u,
            say_v,
            say_w,
            say_x,
            say_y,
            say_z
        )
    }
}