package com.electrodiligent.marathi.data

import com.electrodiligent.core.domain.model.NumberItem
import com.electrodiligent.core.R

object NumberRepository {
    val listUpTo20 = listOf(
        NumberItem(
            name = "शून्य",
            countString = "०",
            count = 0,
            image = R.drawable.circle,
            // audio = com.electrodiligent.hindi.R.raw.hn_0
        ),
        NumberItem(
            name = "एक",
            countString = "१",
            count = 1,
            image = R.drawable.dolphin,
            // audio = com.electrodiligent.hindi.R.raw.hn_1
        ),
        NumberItem(
            name = "दो",
            countString = "२",
            count = 2,
            image = R.drawable.duck_cartoon,
            // audio = com.electrodiligent.hindi.R.raw.hn_2
        ),
        NumberItem(
            name = "तीन",
            countString = "३",
            count = 3,
            image = R.drawable.frog,
            // audio = com.electrodiligent.hindi.R.raw.hn_3
        ),
        NumberItem(
            name = "चार",
            countString = "४",
            count = 4,
            image = R.drawable.hippo,
            // audio = com.electrodiligent.hindi.R.raw.hn_4
        ),
        NumberItem(
            name = "पांच",
            countString = "५",
            count = 5,
            image = R.drawable.notepad,
            // audio = com.electrodiligent.hindi.R.raw.hn_5
        ),
        NumberItem(
            name = "छह",
            countString = "६",
            count = 6,
            image = R.drawable.starfish,
            // audio = com.electrodiligent.hindi.R.raw.hn_6
        ),
        NumberItem(
            name = "सात",
            countString = "७",
            count = 7,
            image = R.drawable.hamster,
            // audio = com.electrodiligent.hindi.R.raw.hn_7
        ),
        NumberItem(
            name = "आठ",
            countString = "८",
            count = 8,
            image = R.drawable.piglet,
            // audio = com.electrodiligent.hindi.R.raw.hn_8
        ),
        NumberItem(
            name = "नौ",
            countString = "९",
            count = 9,
            image = R.drawable.crab,
            // audio = com.electrodiligent.hindi.R.raw.hn_9
        ),
        NumberItem(
            name = "दस",
            countString = "१०",
            count = 10,
            image = R.drawable.octopus,
            // audio = com.electrodiligent.hindi.R.raw.hn_10
        ),
        NumberItem(
            name = "ग्यारह",
            countString = "११",
            count = 11,
            image = R.drawable.ant,
            // audio = com.electrodiligent.hindi.R.raw.hn_11
        ),
        NumberItem(
            name = "बारह",
            countString = "१२",
            count = 12,
            image = R.drawable.penguin,
            // audio = com.electrodiligent.hindi.R.raw.hn_12
        ),
        NumberItem(
            name = "तेरह",
            countString = "१३",
            count = 13,
            image = R.drawable.bee,
            // audio = com.electrodiligent.hindi.R.raw.hn_13
        ),
        NumberItem(
            name = "चौदह",
            countString = "१४",
            count = 14,
            image = R.drawable.radish_catoon,
            // audio = com.electrodiligent.hindi.R.raw.hn_14
        ),
        NumberItem(
            name = "पंद्रह",
            countString = "१५",
            count = 15,
            image = R.drawable.baloon,
            // audio = com.electrodiligent.hindi.R.raw.hn_15
        ),
        NumberItem(
            name = "सोलह",
            countString = "१६",
            count = 16,
            image = R.drawable.pencil,
            // audio = com.electrodiligent.hindi.R.raw.hn_16
        ),
        NumberItem(
            name = "सत्रह",
            countString = "१७",
            count = 17,
            image = R.drawable.tomato,
            // audio = com.electrodiligent.hindi.R.raw.hn_17
        ),
        NumberItem(
            name = "अट्ठारह",
            countString = "१८",
            count = 18,
            image = R.drawable.cap,
            // audio = com.electrodiligent.hindi.R.raw.hn_18
        ),
        NumberItem(
            name = "उन्निस",
            countString = "१९",
            count = 19,
            image = R.drawable.banana,
            // audio = com.electrodiligent.hindi.R.raw.hn_19
        ),
        NumberItem(
            name = "बीस",
            countString = "२०",
            count = 20,
            image = R.drawable.lollipop,
            // audio = com.electrodiligent.hindi.R.raw.hn_20
        )
    )

/*

    private val list21to100 = listOf(


        NumberItem(
            name = "इक्कीस",
            countString = "२१"
            // audio = com.electrodiligent.hindi.R.raw.hn_21
        ),

        NumberItem(
            name = "बाईस",
            countString = "२२",
            // audio = com.electrodiligent.hindi.R.raw.hn_22
        ),

        NumberItem(
            name = "तेईस",
            countString = "२३",
            // audio = com.electrodiligent.hindi.R.raw.hn_23
        ),
        NumberItem(
            name = "चौबीस",
            countString = "२४",
            // audio = com.electrodiligent.hindi.R.raw.hn_24
        ),
        NumberItem(
            name = "पच्चीस",
            countString = "२५",
            // audio = com.electrodiligent.hindi.R.raw.hn_25
        ),
        NumberItem(
            name = "छब्बीस",
            countString = "२६",
            // audio = com.electrodiligent.hindi.R.raw.hn_26
        ),
        NumberItem(
            name = "सत्ताईस",
            countString = "२७",
            // audio = com.electrodiligent.hindi.R.raw.hn_27
        ),
        NumberItem(
            name = "अट्ठाईस",
            countString = " २८",
            // audio = com.electrodiligent.hindi.R.raw.hn_28
        ),
        NumberItem(
            name = "उनतीस",
            countString = "२९",
            // audio = com.electrodiligent.hindi.R.raw.hn_29
        ),
        NumberItem(
            name = "तीस",
            countString = "३०",
            // audio = com.electrodiligent.hindi.R.raw.hn_30
        ),

        NumberItem(
            name = "इकतीस",
            countString = "३१",
            // audio = com.electrodiligent.hindi.R.raw.hn_31
        ),
        NumberItem(
            name = "बत्तीस",
            countString = "३२",
            // audio = com.electrodiligent.hindi.R.raw.hn_32
        ),
        NumberItem(
            name = "तैंतीस",
            countString = "३३",
            // audio = com.electrodiligent.hindi.R.raw.hn_33
        ),
        NumberItem(
            name = "चौंतीस",
            countString = "३४",
            // audio = com.electrodiligent.hindi.R.raw.hn_34
        ),
        NumberItem(
            name = "पैंतीस",
            countString = "३५",
            // audio = com.electrodiligent.hindi.R.raw.hn_35
        ),
        NumberItem(
            name = "छ्त्तीस",
            countString = "३६",
            // audio = com.electrodiligent.hindi.R.raw.hn_36
        ),
        NumberItem(
            name = "सैंतीस",
            countString = "३७",
            // audio = com.electrodiligent.hindi.R.raw.hn_37
        ),
        NumberItem(
            name = "अड़तीस",
            countString = "३८",
            // audio = com.electrodiligent.hindi.R.raw.hn_38
        ),
        NumberItem(
            name = "उनतालीस",
            countString = "३९",
            // audio = com.electrodiligent.hindi.R.raw.hn_39
        ),
        NumberItem(
            name = "चालीस",
            countString = "४०",
            // audio = com.electrodiligent.hindi.R.raw.hn_40
        ),

        NumberItem(
            name = "इकतालीस",
            countString = "४१",
            // audio = com.electrodiligent.hindi.R.raw.hn_41
        ),
        NumberItem(
            name = "बयालीस",
            countString = "४२",
            // audio = com.electrodiligent.hindi.R.raw.hn_42
        ),
        NumberItem(
            name = "तैंतालीस",
            countString = "४३",
            // audio = com.electrodiligent.hindi.R.raw.hn_43
        ),
        NumberItem(
            name = "चौंतालीस",
            countString = "४४",
            // audio = com.electrodiligent.hindi.R.raw.hn_44
        ),
        NumberItem(
            name = "पैंतालीस",
            countString = "४५",
            // audio = com.electrodiligent.hindi.R.raw.hn_45
        ),
        NumberItem(
            name = "छियालीस",
            countString = "४६",
            // audio = com.electrodiligent.hindi.R.raw.hn_46
        ),
        NumberItem(
            name = "सैंतालीस",
            countString = "४७",
            // audio = com.electrodiligent.hindi.R.raw.hn_47
        ),
        NumberItem(
            name = "अड़तालीस",
            countString = "४८",
            // audio = com.electrodiligent.hindi.R.raw.hn_48
        ),
        NumberItem(
            name = "उनचास",
            countString = "४९",
            // audio = com.electrodiligent.hindi.R.raw.hn_49
        ),
        NumberItem(
            name = "पचास",
            countString = "५०",
            // audio = com.electrodiligent.hindi.R.raw.hn_50
        ),

        NumberItem(
            name = "इक्याबन",
            countString = "५१",
            // audio = com.electrodiligent.hindi.R.raw.hn_51
        ),
        NumberItem(
            name = "बावन",
            countString = "५२",
            // audio = com.electrodiligent.hindi.R.raw.hn_52
        ),
        NumberItem(
            name = "तिरेपन",
            countString = "५३",
            // audio = com.electrodiligent.hindi.R.raw.hn_53
        ),
        NumberItem(
            name = "चौअन",
            countString = "५४",
            // audio = com.electrodiligent.hindi.R.raw.hn_54
        ),
        NumberItem(
            name = "पचपन",
            countString = "५५",
            // audio = com.electrodiligent.hindi.R.raw.hn_55
        ),
        NumberItem(
            name = "छप्पन",
            countString = "५६",
            // audio = com.electrodiligent.hindi.R.raw.hn_56
        ),
        NumberItem(
            name = "सत्तावन",
            countString = "५७",
            // audio = com.electrodiligent.hindi.R.raw.hn_57
        ),
        NumberItem(
            name = "अठ्ठावन",
            countString = "५८",
            // audio = com.electrodiligent.hindi.R.raw.hn_58
        ),
        NumberItem(
            name = "उनसठ",
            countString = "५९",
            // audio = com.electrodiligent.hindi.R.raw.hn_59
        ),
        NumberItem(
            name = "साठ",
            countString = "६०",
            // audio = com.electrodiligent.hindi.R.raw.hn_60),

            NumberItem(
                name = "इकसठ",
                countString = "६१",
                // audio = com.electrodiligent.hindi.R.raw.hn_61
            ),
            NumberItem(
                name = "बासठ",
                countString = "६२",
                // audio = com.electrodiligent.hindi.R.raw.hn_62
            ),
            NumberItem(
                name = "तिरसठ",
                countString = "६३",
                // audio = com.electrodiligent.hindi.R.raw.hn_63
            ),
            NumberItem(
                name = "चौंसठ",
                countString = "६४",
                // audio = com.electrodiligent.hindi.R.raw.hn_64
            ),
            NumberItem(
                name = "पैंसठ",
                countString = "६५",
                // audio = com.electrodiligent.hindi.R.raw.hn_65
            ),
            NumberItem(
                name = "छियासठ",
                countString = "६६",
                // audio = com.electrodiligent.hindi.R.raw.hn_66
            ),
            NumberItem(
                name = "सड़सठ",
                countString = "६७",
                // audio = com.electrodiligent.hindi.R.raw.hn_67
            ),
            NumberItem(
                name = "अड़सठ",
                countString = "६८",
                // audio = com.electrodiligent.hindi.R.raw.hn_68
            ),
            NumberItem(
                name = "उनहत्तर",
                countString = "६९",
                // audio = com.electrodiligent.hindi.R.raw.hn_69
            ),
            NumberItem(
                name = "सत्तर",
                countString = "७०",
                // audio = com.electrodiligent.hindi.R.raw.hn_70
            ),

            NumberItem(
                name = "इकहत्तर",
                countString = "७१",
                // audio = com.electrodiligent.hindi.R.raw.hn_71
            ),
            NumberItem(
                name = "बहत्तर",
                countString = "७२",
                // audio = com.electrodiligent.hindi.R.raw.hn_72
            ),
            NumberItem(
                name = "तिहत्तर",
                countString = "७३",
                // audio = com.electrodiligent.hindi.R.raw.hn_73
            ),
            NumberItem(
                name = "चौहत्तर",
                countString = "७४",
                // audio = com.electrodiligent.hindi.R.raw.hn_74
            ),
            NumberItem(
                name = "पिचत्तर",
                countString = "७५",
                // audio = com.electrodiligent.hindi.R.raw.hn_75
            ),
            NumberItem(
                name = "छिहत्तर",
                countString = "७६",
                // audio = com.electrodiligent.hindi.R.raw.hn_76
            ),
            NumberItem(
                name = "सतत्तर",
                countString = "७७",
                // audio = com.electrodiligent.hindi.R.raw.hn_77
            ),
            NumberItem(
                name = "अठत्तर",
                countString = "७८",
                // audio = com.electrodiligent.hindi.R.raw.hn_78
            ),
            NumberItem(
                name = "उनासी",
                countString = "७९",
                // audio = com.electrodiligent.hindi.R.raw.hn_79
            ),
            NumberItem(
                name = "अस्सी",
                countString = "८०",
                // audio = com.electrodiligent.hindi.R.raw.hn_80
            ),

            NumberItem(
                name = "इक्यासी",
                countString = "८१",
                // audio = com.electrodiligent.hindi.R.raw.hn_81
            ),
            NumberItem(
                name = "ब्यासी",
                countString = "८२",
                // audio = com.electrodiligent.hindi.R.raw.hn_82
            ),
            NumberItem(
                name = "तिरासी",
                countString = "८३",
                // audio = com.electrodiligent.hindi.R.raw.hn_83
            ),
            NumberItem(
                name = "चौरासी",
                countString = "८४",
                // audio = com.electrodiligent.hindi.R.raw.hn_84
            ),
            NumberItem(
                name = "पिचासी",
                countString = "८५",
                // audio = com.electrodiligent.hindi.R.raw.hn_85
            ),
            NumberItem(
                name = "छियासी",
                countString = "८६",
                // audio = com.electrodiligent.hindi.R.raw.hn_86
            ),
            NumberItem(
                name = "सतासी",
                countString = "८७",
                // audio = com.electrodiligent.hindi.R.raw.hn_87
            ),
            NumberItem(
                name = "अठासी",
                countString = "८८",
                // audio = com.electrodiligent.hindi.R.raw.hn_88
            ),
            NumberItem(
                name = "नवासी",
                countString = "८९",
                // audio = com.electrodiligent.hindi.R.raw.hn_89
            ),
            NumberItem(
                name = "नब्बे",
                countString = "९०",
                // audio = com.electrodiligent.hindi.R.raw.hn_90
            ),

            NumberItem(
                name = "इक्यानवे",
                countString = "९१",
                // audio = com.electrodiligent.hindi.R.raw.hn_91
            ),
            NumberItem(
                name = "बानवे",
                countString = "९२",
                // audio = com.electrodiligent.hindi.R.raw.hn_92
            ),
            NumberItem(
                name = "तिरानवे",
                countString = "९३",
                // audio = com.electrodiligent.hindi.R.raw.hn_93
            ),
            NumberItem(
                name = "चौरानवे",
                countString = "९४",
                // audio = com.electrodiligent.hindi.R.raw.hn_94
            ),
            NumberItem(
                name = "पिञ्चानवे",
                countString = "९५",
                // audio = com.electrodiligent.hindi.R.raw.hn_95
            ),
            NumberItem(
                name = "छियानवे",
                countString = "९६",
                // audio = com.electrodiligent.hindi.R.raw.hn_96
            ),
            NumberItem(
                name = "सत्तानवे",
                countString = "९७",
                // audio = com.electrodiligent.hindi.R.raw.hn_97
            ),
            NumberItem(
                name = "अठ्ठानवे",
                countString = "९८",
                // audio = com.electrodiligent.hindi.R.raw.hn_98
            ),
            NumberItem(
                name = "निन्यानवे",
                countString = "९९",
                // audio = com.electrodiligent.hindi.R.raw.hn_99
            ),
            NumberItem(
                name = "सौ",
                count = 100,
                countString = "१००",
                // audio = com.electrodiligent.hindi.R.raw.hn_100
            )
        )

        val listUpTo100 : List < NumberItem > = getFlashcardsUpTo100()

    private fun getFlashcardsUpTo100(): List<NumberItem> {
        val mutableList = mutableListOf<NumberItem>()
        mutableList.addAll(listUpTo20)
        mutableList.addAll(list21to100)
        return mutableList
    }
*/


}