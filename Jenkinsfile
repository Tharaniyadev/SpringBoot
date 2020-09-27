node {
   
    def docker = tool name: 'docker', type: 'dockerTool'
    def dockerCMD = "${docker}/bin/docker"
    
    stage('Code Checkout'){
      git credentialsId: 'githubcreds', url: 'https://github.com/Tharaniyadev/SpringBoot.git'  
    }
    
    stage('Build, Test and Package'){
      
     def mavenHome = tool name: 'maven-3', type: 'maven'
        def mavenCMD = "${mavenHome}/bin/mvn"
      sh "${mavenCMD} clean package"
       sh "${mavenCMD} test"
    }
    
    
    
    stage('Build Docker Image'){
       
    sh "sudo systemctl enable docker"
        sh "sudo ${dockerCMD} build -t tharaniyadev/bootcampjenkin:1.0.0.0 ."
    }
    
    stage("pushing Docker image"){
        withCredentials([string(credentialsId: 'dockerHubCreds', variable: 'dockerHubCreds')]) {
        sh "sudo ${dockerCMD} login -u tharaniyadev -p ${dockerHubCreds}"
}
sh "sudo ${dockerCMD} push tharaniyadev/bootcampjenkin:1.0.0.0"
    }
    
    stage('Run the Docker Image'){
        sh "sudo ${dockerCMD} run -p 8886:8080 -d tharaniyadev/bootcampjenkin:1.0.0.0"
    }
    
    
}
