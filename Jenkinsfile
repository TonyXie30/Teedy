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
stage('Test'){
    sh 'mvn test'
    sh 'mvn surefire-report:report'
}
stage('')

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