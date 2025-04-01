import java.util.Scanner;

public class forloop {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        sc.close();

        // for (char i = 'E'; i >= 'A'; i--) {
            //     for (char j = 'E'; j >= 'A'; j--) {
            //     System.out.print(j);
            //     }
            //     System.out.println("");
            //     }
            
    
            //  for (char i = 'E'; i >= 'A'; i--) {
            //     for (char j = 'E'; j >= 'A'; j--) {
            //     System.out.print(i);
            //     }
            //     System.out.println("");
            //     }
    
            // for(int i=5;i>=1;i--){
            //     for(int j=i;j<=5;j++){
            //         System.out.print(i); 
            //     }
            //     System.out.println("");
            // }    
    
            // for(int i=5;i>=1;i--){
            //     for(int j=i;j<=5;j++){
            //         System.out.print(j);
            //     }
            //     System.out.println("");
            // }
    
    
            //   for (int i = 0; i < 5; i++) {
            //     for (char ch = 'E'; ch >= 'E' - i; ch--) {
            //         System.out.print(ch);
            //     }
            //     System.out.println();
            // }
    
          //   for (int i = 0; i < 5; i++) {
          //     char ch = (char) ('E' - i);
          //     for (int j = 0; j <= i; j++) {
          //         System.out.print(ch);
          //     }
          //     System.out.println();
          // }
    
          // int num = 1;
          // for (int i = 0; i < 5; i++) {
          //     int temp = num;
          //     for (int j = 0; j < 5; j++) {
          //         System.out.print(temp + " ");
          //         temp += 2;
          //     }
          //     System.out.println();
          //     num += 10;
          // }
    
          // int  num = 2;
          // for (int i = 0; i < 5; i++) {
          //     int temp = num;
          //     for (int j = 0; j < 5; j++) {
          //         System.out.print(temp + " ");
          //         temp += 2;
          //     }
          //     System.out.println();
          //     num += 10;
          // }
    
          
          // for (int i = 0; i < 5; i++) {
          //     char ch = (char) ('E' - i);
          //     for (int j = 0; j < 5; j++) {
          //         System.out.print(ch);
          //     }
          //     System.out.println();
          // }
    
        //   for (int i = 0; i < 5; i++) {
        //     for (char ch = 'E'; ch >= 'A'; ch--) {
        //         System.out.print(ch);
        //     }
        //     System.out.println();
        // }
    
        // char ch = 'A';
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
    
        // int num = 5;
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(num);
        //     }
        //     num--;
        //     System.out.println();
        // }
    
    
    //     for (int i = 0; i < 5; i++) {
    //       int start = 5 - i;
    //       for (int j = 0; j <= i; j++) {
    //           System.out.print(start + j);
    //       }
    //       System.out.println();
    //   }
            
    
    }
}
