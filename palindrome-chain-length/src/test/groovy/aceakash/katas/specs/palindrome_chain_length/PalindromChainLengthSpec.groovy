package aceakash.katas.specs.palindrome_chain_length

import aceakash.katas.palindrome_chain_length.PalindromeChainLength
import spock.lang.Specification
import spock.lang.Unroll

public class PalindromeChainLengthSpec extends Specification {

    @Unroll
    def "number of steps is 0 for an existing palindrome"() {

        expect:
        PalindromeChainLength.stepsFor(palindrome) == 0

        where:
        palindrome | _
        1          | _
        2          | _
        9          | _
        11         | _
        55         | _
        101        | _
        343        | _
        999        | _
        3443       | _
    }

    def "number of steps is #steps for #input"() {
        expect:
        PalindromeChainLength.stepsFor(input) == steps

        where:
        input | steps
        13    | 1
        23    | 1
        34    | 1
        41    | 1
        29    | 1
        87    | 4
        6356  | 7
        9699  | 8
    }
}
