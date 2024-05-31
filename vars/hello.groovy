def call(Map config=[:]){
    sh "echo hello ${congig.name}. Today is ${config.dayOfWeek}"
}
