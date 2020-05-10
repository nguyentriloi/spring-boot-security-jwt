node {
  stage('SCM Checkout'){
    git 'https://github.com/nguyentriloi/spring-boot-security-jwt.git'
  }
  stage('Compile Package'){
    def mvnHome = tool name: 'mvn', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
  }
}
