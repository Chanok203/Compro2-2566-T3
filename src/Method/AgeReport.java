package Method;

public class AgeReport {

    static int reportAge(int[] ids, int[] ages, int min, int max) {
        int count = 0;
        int L = ids.length;
        for (int i = 0; i < L; ++i) {
            if (min <= ages[i] && ages[i] <= max) { // min <= age <= max
                count++;
                System.out.println(ids[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 8;
        int[] ids = {123, 456, 789 ,523, 693, 190, 191, 911};
        int[] ages = {21, 19, 26, 25, 23, 29, 23, 14};
        int min = 21;
        int max = 25;
        int count = reportAge(ids, ages, min, max);
        String line = String.format("There are %d persons in age range of %d to %d", count, min, max);
        System.out.println(line);
    }

}
