package libs;

def helloWorld(Map params){
    if (params.name == null){
        throw new Exception("The name parameter is missing!!!!!");
    }
    if (params.build_id == null){
        throw new Exception("The build_id parameter is missing!!!!!");
    }
    if(!(params.name instanceof String)){
        throw new Exception("The name parameter is not a string!!!!!");
    }
    f(!(params.build_id instanceof String)){
        throw new Exception("The built_id parameter is not a string!!!!!");
    }
    sh "echo Hello ${params.name}. This is ${params.build_id} build"
}

def helloWorld2(){
    sh "echo Hello Wolrd2"
}

return this;