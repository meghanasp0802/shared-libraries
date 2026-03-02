def call(String ImageTag, String DockerHubUser, String ProjectName)
{
  bat "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
