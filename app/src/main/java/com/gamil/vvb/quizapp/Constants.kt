package com.gamil.vvb.quizapp

import com.gamil.vvb.quizapp.R
import com.gamil.vvb.quizapp.Question
object Constants {

    const val USER_NAME : String =  "user_name"
    const val TOTAL_QUESTIONS : String ="total_question"
    const val CORRECT_ANSWERS :String ="Correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
                1, "Biểu tượng này thuộc về đội bóng nào?",
                R.drawable.ic_arsenal,
                "FC Arsenal", "FC Manchester City",
                "FC Real Madrid", "FC Barcelona", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
                2, "Biểu tượng này thuộc về đội bóng nào?",
                R.drawable.ic_barcelona,
                "FC Manchester United", "FC Liverpool",
                "FC Barcelona", "FC AC Milan", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
                3, "Biểu tượng này thuộc về đội bóng nào?",
                R.drawable.ic_real,
                "FC Bayern Munich", "FC Liverpool",
                "FC Liverpool", "FC Real Madrid", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
                4, "Biểu tượng này thuộc về đội bóng nào?",
                R.drawable.ic_mu,
                "FC AC Milan", "FC Manchester United",
                "FC Arsenal", "FC Bayern Munich", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
                5, "Biểu tượng này thuộc về đội bóng nào?",
                R.drawable.ic_acmilan,
                "FC Bayern Munich", "FC Chelsea",
                "FC AC Milan", "Manchester City FC", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
                6, "Biểu tượng này thuộc về đội bóng nào?",
                R.drawable.ic_mancity,
                "Manchester City FC", "Juventus F.C",
                "FC AC Milan", "FC Real Madrid", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
                7, "Biểu tượng này thuộc về đội bóng nào?",
                R.drawable.ic_chelsea,
                "FC Liverpool", "FC Barcelona",
                "FC Chelsea", "Manchester City FC", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
                8, "Biểu tượng này thuộc về đội bóng nào?",
                R.drawable.ic_hagl,
                "FC Liverpool", "FC Chelsea",
                "FC AC Milan", "FC Hoàng Anh Gia Lai", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
                9, "Biểu tượng này thuộc về đội bóng nào?",
                R.drawable.ic_bayern,
                "FC Barcelona", "FC Bayern Munich",
                "FC Arsenal", "United States of America", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
                10, "Biểu tượng này thuộc về đội bóng nào?",
                R.drawable.ic_juven,
                "Juventus F.C", "FC Liverpool",
                "FC Chelsea", "FC Barcelona", 1
        )

        questionsList.add(que10)

        return questionsList
    }
}