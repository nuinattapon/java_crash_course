package me.nattapon.java.example;

public class BreakLabel {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        a:
        for (int i = 0; i <= 5; i++) {
            b:
            for (int j = 0; j <= 5; j++) {
                c:
                for (int k = 0; k <= 5; k++) {
                    System.out.printf("k = %2d, j = %2d, i = %2d\n",k,j,i);
                    if (k == 5 && j == 1 && i == 0) {
                        break a;
                    }
                }
            }
        }
    }
}