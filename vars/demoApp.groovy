def uber(String repoUrl){
    pipeline {
       agent any
       stages {
           stage("Tools initialization"){
               steps {
                   sh 'lscpu'
                   sh 'java -version'
               }
           }
           stage("Checkout"){
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
               }
           }
           stage("to-test") {
               steps {
                   sh 'lsblk'
               }
           }
       }
    }
}
