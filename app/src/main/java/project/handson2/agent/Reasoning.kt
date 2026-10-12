package project.handson2.agent

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class Reasoning {

    fun think(input: String): String {

        return when {

            input.contains("hello") ->
                "GREETING"

            input.contains("hi") ->
                "GREETING"

            input.contains("time") ->
                "TIME"

            input.contains("date") ->
                "DATE"

            input.contains("bye") ->
                "GOODBYE"

            input.contains("thank") ->
                "THANKS"

            else ->
                "UNKNOWN"
        }
    }

    fun currentTime(): String {

        return SimpleDateFormat(
            "hh:mm a",
            Locale.getDefault()
        ).format(Date())
    }

    fun currentDate(): String {

        return SimpleDateFormat(
            "dd MMM yyyy",
            Locale.getDefault()
        ).format(Date())
    }
}