import java.io. *;
class AdditionBufferedReader {
    public static void main (String args []) throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Enter First Number: ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter Second Number: ");
        int b = Integer.parseInt(br.readLine());
        int sum = a + b;
        System.out.println("Addition = " + sum);
    }
}
