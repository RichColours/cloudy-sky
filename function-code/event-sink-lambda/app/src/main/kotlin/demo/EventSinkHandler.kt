package demo

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.amazonaws.services.lambda.runtime.events.LambdaDestinationEvent

class EventSinkHandler : RequestHandler<LambdaDestinationEvent, String> {

    override fun handleRequest(input: LambdaDestinationEvent?, context: Context?): String {

        val detail = input!!.requestPayload["detail"] as Map<String, Object>
        val helloValue = detail["hello"] as Any

        println(helloValue)

        return """
            {
                "value": "$helloValue"
            }
        """.trimIndent()
    }
}
