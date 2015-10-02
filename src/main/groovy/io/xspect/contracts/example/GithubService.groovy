package io.xspect.contracts.example


import org.springframework.web.client.RestTemplate

class GithubService {
  def commitEndpoint = "https://api.github.com/repos/roykachouh/xspect/commits"

  def commits() {
    def params = [state: 'closed']

    new RestTemplate().getForObject(commitEndpoint, String.class, params);
  }
}
