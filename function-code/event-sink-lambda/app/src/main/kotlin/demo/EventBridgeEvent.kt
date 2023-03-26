package demo

class EventBridgeEvent<T> {

    lateinit var version: String
    lateinit var id: String
    //lateinit var detail-type: String
    lateinit var source: String
    lateinit var account: String
    lateinit var time: String
    lateinit var region: String
    lateinit var resources: List<String>
    var detail: T? = null
}
