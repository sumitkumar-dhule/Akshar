package com.diligentapps.akshar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.diligentapps.core.domain.model.DisplayCharacter
import com.diligentapps.core.presentation.CharacterDisplayWidget

@Composable
fun HomeScreen() {

    Box(modifier = Modifier.fillMaxSize()) {

        val list = listOf<DisplayCharacter>(
            DisplayCharacter(
                display = "A", left = "Z", right = "B",
                displayName = "APPLE",
                displayImage = painterResource(id = R.drawable.a),
                subtitle = "a",
                audio = R.raw.a_for_apple
            ),
            DisplayCharacter(
                display = "B", left = "A", right = "C", displayName = "BALL",
                displayImage = painterResource(id = R.drawable.b),
                        subtitle = "b",
                audio = R.raw.b_for_ball
            ),
            DisplayCharacter(
                display = "C", left = "B", right = "D", displayName = "CAT",
                displayImage = painterResource(id = R.drawable.c),
                subtitle = "c",
                audio = R.raw.c_for_cat
            ),

            DisplayCharacter(
                display = "D", left = "C", right = "E", displayName = "DOG",
                displayImage = painterResource(id = R.drawable.d),
                subtitle = "d",
                audio = R.raw.d_for_dog
            ),

            DisplayCharacter(
                display = "E", left = "D", right = "F", displayName = "ELEPHANT",
                displayImage = painterResource(id = R.drawable.e),
                subtitle = "e",
                audio = R.raw.e_for_eleephant
            ),

            DisplayCharacter(
                display = "F", left = "E", right = "G", displayName = "FISH",
                displayImage = painterResource(id = R.drawable.f),
                subtitle = "f",
                audio = R.raw.f_for_fish
            ),

            DisplayCharacter(
                display = "G", left = "F", right = "H", displayName = "GRAPES",
                displayImage = painterResource(id = R.drawable.g),
                subtitle = "g",
                audio = R.raw.g_for_grapes
            ),

            DisplayCharacter(
                display = "H", left = "G", right = "I", displayName = "HAT",
                displayImage = painterResource(id = R.drawable.h),
                subtitle = "h",
                audio = R.raw.h_for_hat
            ),

            DisplayCharacter(
                display = "I", left = "H", right = "J", displayName = "ICE-CREAM",
                displayImage = painterResource(id = R.drawable.i),
                subtitle = "i",
                audio = R.raw.i_for_icecream
            ),

            DisplayCharacter(
                display = "J", left = "I", right = "K", displayName = "JUG",
                displayImage = painterResource(id = R.drawable.j),
                subtitle = "j",
                audio = R.raw.j_for_jug
            ),

            DisplayCharacter(
                display = "K", left = "J", right = "L", displayName = "KITE",
                displayImage = painterResource(id = R.drawable.k),
                subtitle = "k",
                audio = R.raw.k_for_kite
            ),

            DisplayCharacter(
                display = "L", left = "K", right = "M", displayName = "LEMON",
                displayImage = painterResource(id = R.drawable.l),
                subtitle = "l",
                audio = R.raw.l_for_lemon
            ),

            DisplayCharacter(
                display = "M", left = "L", right = "N", displayName = "MONKEY",
                displayImage = painterResource(id = R.drawable.m),
                subtitle = "m",
                audio = R.raw.m_for_monkey
            ),

            DisplayCharacter(
                display = "N", left = "M", right = "O", displayName = "NEST",
                displayImage = painterResource(id = R.drawable.n),
                subtitle = "n",
                audio = R.raw.n_for_nest
            ),

            DisplayCharacter(
                display = "O", left = "N", right = "P", displayName = "OWL",
                displayImage = painterResource(id = R.drawable.o),
                subtitle = "o",
                audio = R.raw.o_for_owl
            ),

            DisplayCharacter(
                display = "P", left = "O", right = "Q", displayName = "PARROT",
                displayImage = painterResource(id = R.drawable.p),
                subtitle = "p",
                audio = R.raw.p_for_parrot
            ),

            DisplayCharacter(
                display = "Q", left = "P", right = "R", displayName = "QUEEN",
                displayImage = painterResource(id = R.drawable.q),
                subtitle = "q",
                audio = R.raw.q_for_queen
            ),

            DisplayCharacter(
                display = "R", left = "Q", right = "S", displayName = "RABBIT",
                displayImage = painterResource(id = R.drawable.r),
                subtitle = "r",
                audio = R.raw.r_for_rabbit
            ),

            DisplayCharacter(
                display = "S", left = "R", right = "T", displayName = "SNAIL",
                displayImage = painterResource(id = R.drawable.s),
                subtitle = "s",
                audio = R.raw.s_for_snail
            ),

            DisplayCharacter(
                display = "T", left = "S", right = "U", displayName = "TIGER",
                displayImage = painterResource(id = R.drawable.t),
                subtitle = "t",
                audio = R.raw.t_for_tiger
            ),

            DisplayCharacter(
                display = "U", left = "T", right = "V", displayName = "UMBRELLA",
                displayImage = painterResource(id = R.drawable.u),
                subtitle = "u",
                audio = R.raw.u_for_umbrella
            ),

            DisplayCharacter(
                display = "V", left = "U", right = "W", displayName = "VIOLIN",
                displayImage = painterResource(id = R.drawable.v),
                subtitle = "v",
                audio = R.raw.v_for_violine
            ),

            DisplayCharacter(
                display = "W", left = "V", right = "X", displayName = "WATERMELON",
                displayImage = painterResource(id = R.drawable.w),
                subtitle = "w",
                audio = R.raw.w_for_watermellon
            ),

            DisplayCharacter(
                display = "X", left = "W", right = "Y", displayName = "X-MAS",
                displayImage = painterResource(id = R.drawable.x),
                subtitle = "x",
                audio = R.raw.x_for_xmas
            ),

            DisplayCharacter(
                display = "Y", left = "X", right = "Z", displayName = "YAK",
                displayImage = painterResource(id = R.drawable.y),
                subtitle = "y",
                audio = R.raw.y_for_yak
            ),

            DisplayCharacter(
                display = "Z", left = "Y", right = "A", displayName = "ZEBRA",
                displayImage = painterResource(id = R.drawable.z),
                subtitle = "z",
                audio = R.raw.z_for_zaebra
            )
        )

        CharacterDisplayWidget(list)
    }

}