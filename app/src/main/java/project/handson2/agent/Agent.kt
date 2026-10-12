package project.handson2.agent

import project.handson2.model.AgentResponse

class Agent {

    private val perception = Perception()
    private val reasoning = Reasoning()
    private val action = Action()

    fun process(userInput: String): AgentResponse {

        val perceivedData = perception.read(userInput)

        val reasoningResult = reasoning.think(perceivedData)

        val actionResult = action.execute(reasoningResult)

        return AgentResponse(
            perception = perceivedData,
            reasoning = reasoningResult,
            action = actionResult
        )
    }
}