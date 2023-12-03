public class ForLoopChallenge {
    public static void main(String[] args) {

    }

    public static boolean isOddSimple (int number){
        if(number > 0 && number % 2 != 0) return true;
        return false;
    }

    public static boolean isOdd(int number){
        // return number<=0?false:(number%2==1);
        return number > 0 && number%2==1;
    }

    public static int sumOddSimple(int start, int end){
        int sum = 0;
        if(start < 0 || end < 0 || end < start) return -1;
        for (int i = start; i <= end; i++){
            sum = isOddSimple(i) ? sum + i : sum;
        }
        return sum;
    }

    public static int sumOddArithmaticProgression(int start, int end){
        if (start>end || start<=0) {
            return -1;
        }

        // return (isOdd(end)?(((end+1)/2)*((end+1)/2)):((end/2)*(end/2)))-(isOdd(start)?(((start-1)/2)*((start-1)/2)):((start/2)*(start/2)));

        return (
                isOdd(end) ? (((int) Math.pow((end+1)/2, 2))) : ((int) Math.pow(end/2, 2)))
                - (isOdd(start) ? ((int) Math.pow((start-1)/2, 2)) : ((int) Math.pow(start/2, 2))
        );
    }
}
