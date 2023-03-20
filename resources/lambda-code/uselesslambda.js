var aws = require('aws-sdk')

exports.handler = async function(event, context) {
    console.log("Event received!");
    console.log(event);
}
