package project.handson2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import project.handson2.agent.Agent

class MainActivity : AppCompatActivity() {

    private lateinit var etInput: EditText
    private lateinit var btnAnalyze: Button
    private lateinit var tvPerception: TextView
    private lateinit var tvReasoning: TextView
    private lateinit var tvAction: TextView

    private val agent = Agent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etInput = findViewById(R.id.etInput)
        btnAnalyze = findViewById(R.id.btnAnalyze)
        tvPerception = findViewById(R.id.tvPerception)
        tvReasoning = findViewById(R.id.tvReasoning)
        tvAction = findViewById(R.id.tvAction)

        btnAnalyze.setOnClickListener {

            val input = etInput.text.toString()

            val response = agent.process(input)

            tvPerception.text = "Perception:\n${response.perception}"
            tvReasoning.text = "Reasoning:\n${response.reasoning}"
            tvAction.text = "Action:\n${response.action}"
        }
    }
}