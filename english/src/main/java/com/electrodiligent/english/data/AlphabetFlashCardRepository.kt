package com.electrodiligent.english.data

import com.electrodiligent.english.R.raw.*
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
}