package demo

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.amazonaws.services.lambda.runtime.events.LambdaDestinationEvent

class EventSinkHandler : RequestHandler<LambdaDestinationEvent, String> {

    override fun handleRequest(input: LambdaDestinationEvent?, context: Context?): String {


        return """
            {
                "hello": "world"
            }
        """.trimIndent()
    }
}
