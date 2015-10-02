package io.xspect.contracts.example


import org.springframework.web.client.RestTemplate

class GithubService {
  def commitEndpoint = "https://api.github.com/repos/roykachouh/xspect/commits"

  RestTemplate restTemplate

  def commits() {
    def params = [state: 'closed']

    restTemplate.getForObject(commitEndpoint, String.class, params);
  }
}
