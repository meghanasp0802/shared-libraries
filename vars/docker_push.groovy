def call(String Project,String ImageTag, String dockerhubUser)
{
  withCredentials([usernamePassword(credentialsId: 'dockerHubCred' , passwordVariable: 'dockerHubPass', usernameVariable:'dockerHubUser')])
  bat "docker login -u ${dockerhubUser} -p ${dockerhubpass}"
  bat "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
