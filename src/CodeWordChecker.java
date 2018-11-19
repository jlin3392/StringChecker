public class CodeWordChecker implements StringChecker {

    private int min;
    private int max;
    private String notOccur;
    private String str;

    public CodeWordChecker(int min, int max, String str) {
        this.min = min;
        this.max = max;
        this.str = str;
    }

    public CodeWordChecker(String str) {
        this.min = 6;
        this.max = 20;
        this.str = str;
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
