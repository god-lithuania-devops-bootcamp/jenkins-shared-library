package libs;

def helloWorld(Map params){
    if (params.name == null){
        throw new Exception("Name parameter is missing!!!!!");
    }
    sh "echo Hello ${params.name}. This is ${params.build_id} build"
}

def helloWorld2(){
    sh "echo Hello Wolrd2"
}

return this;