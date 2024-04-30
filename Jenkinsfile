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
stage('doc'){
    steps{
        sh 'mvn javadoc:javadoc --fail-never'
        sh 'mvn javadoc:jar --fail-never'
        sh 'mvn javadoc:aggregate --fail-never'
        sh 'mvn javadoc:aggregate-jar --fail-never'
    }
}
stage('Test'){
    steps{
        sh 'mvn surefire-report:report'
        sh 'mvn test --fail-never'
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