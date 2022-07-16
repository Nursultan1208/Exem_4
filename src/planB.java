import java.util.Scanner;

public class planB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ведите значение для массива : ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Введите размер массива: ");
            ar[i] = sc.nextInt();
        }
        int m=ar[0],m2=ar[0];
        for(int i=0;i<n;i++)
        {
            if(ar[i]>m)
                m=ar[i];
        }
        for(int i=0;i<n;i++)
        {
            if(ar[i]>m2 && ar[i]<m)
                m2=ar[i];
        }
        System.out.println("Второй по величине : "+m2);
        sc.close();
    }
}
