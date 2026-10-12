package project.handson2.agent

class Perception {

    fun read(input: String): String {

        return input
            .trim()
            .lowercase()
    }
}