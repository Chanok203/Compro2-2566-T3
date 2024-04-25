package String;

public class SubMatch1 {
    public static void main(String[] args) {
        String msg = "AULAQZVBAFGASRUKZQFP";
        String str = "PQULA";

        String a = str.substring(0, 3); // [0, 3) -> [0, 1, 2]
        String b = str.substring(1, 4);
        String c = str.substring(2, 5);
        String[] arr = {a, b, c};
        for (int i = 0; i<arr.length; ++i) {
            int idx = msg.indexOf(arr[i]);
            if (idx == -1) {
                System.out.println("no");
            } else {
                System.out.println(idx+1);
            }
        }
    }
}
