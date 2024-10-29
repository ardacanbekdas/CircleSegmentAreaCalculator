package PatikaOdevlerVePratikler;

import java.util.Scanner;

public class CircleSegmentAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen r değerini giriniz: ");
        int r = input.nextInt();
        System.out.print("Lütfen Alfa değerini giriniz: ");
        int alfa = input.nextInt();
        final double pi = 3.14;
        double alfaAlan = (pi * (r *r) * alfa) / 360;
        System.out.print("Alfa değerin alanı: " + alfaAlan);


    }
}



/*Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360*/