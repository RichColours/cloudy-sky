package demo

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler

class EventSinkHandler : RequestHandler<EventBridgeEvent<EventSinkInputEvent>, String> {

    override fun handleRequest(input: EventBridgeEvent<EventSinkInputEvent>, context: Context): String {

        context.logger.log("--- Welcome to EventSinkLambda ---")

        val detail = input.detail
        val helloValue = detail!!.hello

        context.logger.log(detail.toString())
        context.logger.log(helloValue)

        return """
            {
                "value": "$helloValue"
            }
        """.trimIndent()
    }
}
