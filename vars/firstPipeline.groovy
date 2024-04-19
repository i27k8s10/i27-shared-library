import com.i27academy.builds.Calculator
def call(Map pipelineParams){
    Calculator calculator = new Calculator(this)    
    pipeline {
        agent any 
        environment {
            APP_NAME = "${pipelineParams.appName}"
        }
        stages {
            stage ('AdditionStage') {
                steps {
                    script {
                        echo "Printing sum of 2 numbers"
                        println calculator.add(10,20)
                        echo "My MicroService Name is: ${APP_NAME}"
                    }
                }
            }
            stage ('Mailing') {
                steps {
                    echo "Sending a mail !!!!!!!!!!!!"
                }
            }
        }
    }
}
