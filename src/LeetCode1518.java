public class LeetCode1518 {

    public int numWaterBottles(int numBottles, int numExchange) {

        if (numBottles < numExchange) {
            return numBottles;
        }
        int sum = 0;
        int rem = 0;
        while (numBottles+rem >= numExchange) {
            sum = sum + numBottles;
            numBottles = numBottles + rem;
            rem = numBottles % numExchange;
            numBottles = numBottles / numExchange;

        }

        return sum+numBottles;
    }
}
