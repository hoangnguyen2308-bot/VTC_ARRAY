import com.company.Main;

import java.util.Random;

public class lietke {
    public static void main(String[] args) {
        Random rd = new Random();
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i]= rd.nextInt(10);
            if(a[i]%2==0)
                System.out.println(a[i]);

        }
    }
}
