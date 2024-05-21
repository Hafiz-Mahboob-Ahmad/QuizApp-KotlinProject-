package com.example.quizrebuild

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "Which country does this flag belong to?",
            R.drawable.argentina1_flag,
            "Argentina", "Australia",
            "Armenia","Angola",
            1
        )

        val que2 = Question(
            2, "Which country does this flag belong to?",
            R.drawable.australia2_flag,
            "Angola", "Austria",
            "Australia","Armenia",
            3
        )

        val que3 = Question(
            3, "Which country does this flag belong to?",
            R.drawable.brazil3_flag,
            "Belarus", "Belize",
            "Brunei","Brazil",
            4
        )

        val que4 = Question(
            4, "Which country does this flag belong to?",
            R.drawable.belgium4_flag,
            "Bahamas", "Belgium",
            "Barbados","Belize",
            2
        )

        val que5 = Question(
            5, "Which country does this flag belong to?",
            R.drawable.fiji5_flag,
            "Gabon", "France",
            "Fiji","Finland",
            3
        )

        val que6 = Question(
            6, "Which country does this flag belong to?",
            R.drawable.germany6_flag,
            "Germany", "Georgia",
            "Greece","Iran",
            1
        )

        val que7 = Question(
            7, "Which country does this flag belong to?",
            R.drawable.denmark7_flag,
            "Dominica", "Egypt",
            "Denmark","Ethiopia",
            3
        )

        val que8 = Question(
            8, "Which country does this flag belong to?",
            R.drawable.pakistan8_flag,
            "Ireland", "Iran",
            "Hungary","Pakistan",
            4
        )

        val que9 = Question(
            9, "Which country does this flag belong to?",
            R.drawable.new_zealand9_flag,
            "New Zealand", "Jordan",
            "Sudan","Palestine",
            1
        )

        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        questionsList.add(que6)
        questionsList.add(que7)
        questionsList.add(que8)
        questionsList.add(que9)
        return questionsList
    }

}