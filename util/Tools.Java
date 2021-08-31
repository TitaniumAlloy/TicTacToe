import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        
        //initializing length 
        int length = scanner.nextInt();
        int[] size = new int[length];
        
        for (int i = 0; i < length; i++) {
            size[i] = scanner.nextInt();
        }
        
        int check = scanner.nextInt();
        
        for (int j : size) {
            if (j == check) {
                found = true;
                break;
            }
        }
        
        System.out.println(found);
    }
}
