package aceakash.katas.palindrome_chain_length

class PalindromeChainLength {

    public static int stepsFor(int input) {
        def stepCount = 0
        while(!isPalindrome(input)) {
            input = input + reverse(input)
            stepCount++
        }
        stepCount
    }

    private static boolean isPalindrome(int number) {
        reverse(number) == number
    }

    private static int reverse(int number) {
        number.toString().reverse().toInteger()
    }
}
