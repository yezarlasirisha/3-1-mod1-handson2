package project.handson2.agent

class Action {

    private val reasoning = Reasoning()

    fun execute(rule: String): String {

        return when (rule) {

            "GREETING" ->
                "Hello User! Welcome to the AI Agent Workflow Lab."

            "TIME" ->
                "Current Time: ${reasoning.currentTime()}"

            "DATE" ->
                "Today's Date: ${reasoning.currentDate()}"

            "GOODBYE" ->
                "Goodbye! Have a wonderful day."

            "THANKS" ->
                "You're welcome!"

            else ->
                "Sorry! I couldn't understand your request."
        }
    }
}