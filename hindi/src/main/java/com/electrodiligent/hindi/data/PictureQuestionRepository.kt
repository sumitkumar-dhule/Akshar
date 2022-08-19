package com.electrodiligent.hindi.data

import com.electrodiligent.core.domain.model.PictureItem
import com.electrodiligent.core.domain.model.PictureQuestion
import com.electrodiligent.english.data.FruitsRepository

object PictureQuestionRepository {
    val vegetableQuestionList =
        getVegetableQuestions(repository = VegetablesRepository.list).shuffled()
    val fruitQuestionList = getVegetableQuestions(repository = FruitsRepository.list).shuffled()
    val animalQuestionList = getVegetableQuestions(repository = AnimalsRepository.list).shuffled()
    val birdQuestionList = getVegetableQuestions(repository = BirdsRepository.list).shuffled()
    val shapeQuestionList = getVegetableQuestions(repository = ShapeRepository.list).shuffled()
    val colorQuestionList = getVegetableQuestions(repository = getColorPictureRepository()).shuffled()

    private fun getVegetableQuestions(repository: List<PictureItem>): List<PictureQuestion> {
        val questionList: MutableList<PictureQuestion> = mutableListOf()
        for (item in repository) {
            questionList.add(
                PictureQuestion(
                    correctAnswer = item,
                    question = item.name,
                    options = createOptions(correctAnswer = item, repository)
                )
            )
        }
        return questionList
    }

    private fun createOptions(
        correctAnswer: PictureItem,
        pictureItem: List<PictureItem>
    ): List<PictureItem> {
        val options: MutableList<PictureItem> = mutableListOf()
        options.add(correctAnswer)

        val availableOptions = pictureItem.toMutableList()
        availableOptions.remove(correctAnswer)

        while (options.size < 4) {
            val randomOption = availableOptions.random()
            options.add(randomOption)
            availableOptions.remove(randomOption)
        }
        return options.shuffled()
    }

    private fun getColorPictureRepository(): List<PictureItem> {
        var mutableList = mutableListOf<PictureItem>()

        for (color in ColorRepository.list) {
            mutableList.add(
                PictureItem(
                    name = color.name,
                    color = color.colorValue,
                    imageId = com.electrodiligent.core.R.drawable.square,
                    audio = color.audio
                )
            )
        }

        return mutableList
    }

}