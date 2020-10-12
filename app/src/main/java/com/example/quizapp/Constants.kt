package com.example.quizapp

object Constants
{
    const val USER_NAME :String = "user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"


    fun getQuestion():ArrayList<Question>{
        val questionList =ArrayList<Question>()

        val ques1 = Question(
            1,
            "What country does this flag belongs to ?",
            R.drawable.flag_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1)

        questionList.add(ques1)

        val ques2 = Question(
            2,
            "What country does this flag belongs to ?",
            R.drawable.australia_flag,
            "Angola",
            "Austria",
            "Australia",
            "Armenia",
            3)

        questionList.add(ques2)
        val ques3 = Question(
            3,
            "What country does this flag belongs to ?",
            R.drawable.flag_brazil,
            "Belarus",
            "Belzie",
            "Brunie",
            "Brazil",
            4)

        questionList.add(ques3)

        val ques4 = Question(
            4,
            "What country does this flag belongs to ?",
            R.drawable.belgium_flag,
            "Bahamas",
            "Belgium",
            "Barbados",
            "Belize",
            2)

        questionList.add(ques4)

        val ques5 = Question(
            5,
            "What country does this flag belongs to ?",
            R.drawable.fiji_flag,
            "Gabon",
            "France",
            "Fiji",
            "Finland",
            3)

        questionList.add(ques5)

        val ques6 = Question(
            6,
            "What country does this flag belongs to ?",
            R.drawable.germany_flag,
            "Georgia",
            "Germany",
            "Greece",
            "None of these",
            2)

        questionList.add(ques6)

        val ques7 = Question(
            7,
            "What country does this flag belongs to ?",
            R.drawable.denmark_flag,
            "Dominica",
            "Egypt",
            "Denmark",
            "Ethiopia",
            3)

        questionList.add(ques7)

        val ques8 = Question(
            8,
            "What country does this flag belongs to ?",
            R.drawable.india_flag,
            "Ireland",
            "Iran",
            "Hungary",
            "India",
            4)

        questionList.add(ques8)

        val ques9 = Question(
            9,
            "What country does this flag belongs to ?",
            R.drawable.newzeland_flag,
            "Australia",
            "New Zealand",
            "Tuvalu",
            "United States of America",
            2)

        questionList.add(ques9)

        val ques10 = Question(
            10,
            "What country does this flag belongs to ?",
            R.drawable.jordan_flag,
            "Kuwait",
            "Jordan",
            "Sudan",
            "Palestine",
            2)

        questionList.add(ques10)
        return questionList
    }

}