package libs;

def helloWorld(String name = "", String build_id=""){
    sh "echo Hello ${name}. This is ${build_id} build"
}

def helloWorld2(){
    sh "echo Hello Wolrd2"
}

return this;