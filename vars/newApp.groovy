def uber(String repoUrl){
    pipeline{
        agent any 
        stages{
            stage('1-build'){
                steps {
                    sh 'free -m'
                }
            }
            stage("Checkout Code"){
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
               }
           }
           stage ('2-closing'){
            steps{
                echo "This is newapp"
            }
           }
        }
    }
}