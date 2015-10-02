package io.xspect.contracts.example
import co.freeside.betamax.ProxyConfiguration
import co.freeside.betamax.TapeMode
import co.freeside.betamax.junit.Betamax
import co.freeside.betamax.junit.RecorderRule
import org.junit.Rule
import spock.lang.Specification

class GithubServiceTest extends Specification {
  def configuration = ProxyConfiguration.builder()
          .tapeRoot(new File('src/test/resources/tapes'))
          .sslEnabled(true)
          .build()

  @Rule
  RecorderRule recorder = new RecorderRule(configuration)

  def githubService = new GithubService()

  @Betamax(tape = 'git-commits-success', mode = TapeMode.READ_WRITE)
  void 'retrieve git commits for this project'() {
    def commits
    when:
      commits = githubService.commits()
    then:
      assert commits
  }
}
