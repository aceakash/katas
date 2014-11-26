import main.groovy.EightTowers
import spock.lang.*

class EightTowerSpec extends Specification {
    def "towerCombinations(n) returns the number of combinations possible for n towers"() {
        EightTowers eightTowers = new EightTowers()

        expect:
            eightTowers.towerCombinations(n) == comboCount

        where:
        n | comboCount
        2 | 2
        3 | 6
    }
}