public class CodeWordChecker implements StringChecker {

    private int min;
    private int max;
    private String notOccur;
    private String str;

    public CodeWordChecker(int min, int max, String notOccur) {
        this.min = min;
        this.max = max;
        this.notOccur = notOccur;
    }

    public CodeWordChecker(String notOccur) {
        this.min = 6;
        this.max = 20;
        this.notOccur = notOccur;
    }

    public boolean isValid(String str) {
        boolean withinLimits = false;
        boolean doesNotOccur = false;

        if (str.length() >= min && str.length() <= max) {
            withinLimits = true;
        }

        if (str.indexOf(this.notOccur) == -1) {
            doesNotOccur = true;
        }



        if (withinLimits && doesNotOccur) {
            return true;
        }

        return false;
    }
}
