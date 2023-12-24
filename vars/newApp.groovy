def seek(String repoUrl){
    pipeline {
       agent any
       stages {
           stage("Tools initialization"){
               steps {
                   sh 'lscpu'
                   sh 'java -version'
               }
           }
           stage("Checkout Code"){
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
               }
           }
           stage("to-test-code"){
               steps {
                   sh 'lsblk'
               }
           }
       }
}
}
