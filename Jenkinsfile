pipeline {
agent any
stages {
stage('Build') {
steps {
sh 'mvn -B -DskipTests clean package'
}
}
stage('pmd') {
steps {
sh 'mvn pmd:pmd'
}
}
stage('javadoc'){
steps {
    sh 'mvn javadoc:jar'
}
}
stage('Test'){
    steps{
        sh 'mvn test'
        sh 'mvn surefire-report:report'
    }
}
}
}
post {
always {
archiveArtifacts artifacts: '**/target/site/**', fingerprint: true
archiveArtifacts artifacts: '**/target/**/*.jar', fingerprint: true
archiveArtifacts artifacts: '**/target/**/*.war', fingerprint: true
}
}
}