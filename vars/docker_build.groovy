def call(String ImageTag, String DockerHubUser)
{
  bat "docker build -t {DockerHubUser}/${ProjectName}:${ImageTag} ."
}
