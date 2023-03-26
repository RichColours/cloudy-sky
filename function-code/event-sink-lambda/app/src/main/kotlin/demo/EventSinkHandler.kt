package demo

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.amazonaws.services.lambda.runtime.events.LambdaDestinationEvent

class EventSinkHandler : RequestHandler<LambdaDestinationEvent, String> {

    override fun handleRequest(input: LambdaDestinationEvent?, context: Context?): String {

        context!!.logger.log("--- Welcome to EventSinkLambda ---")

        context.logger.log(input!!.requestPayload.toString())

        val detail = input.requestPayload["detail"] as Map<String, Any>
        val helloValue = detail["hello"] as String

        context.logger.log(detail.toString())
        context.logger.log(helloValue)

        return """
            {
                "value": "$helloValue"
            }
        """.trimIndent()
    }
}
