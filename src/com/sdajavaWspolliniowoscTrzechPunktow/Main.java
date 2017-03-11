package com.sdajavaWspolliniowoscTrzechPunktow;

import java.util.Scanner;

public class Main {

    public int pkt1_X;
    public int pkt1_Y;
    public int pkt2_X;
    public int pkt2_Y;
    public int pkt3_X;
    public int pkt3_Y;

    public Main (){
        Scanner sc = new Scanner(System.in);
            System.out.println("podaj wspX punktu 1");
                this.pkt1_X = sc.nextInt();
            System.out.println("podaj wspY punktu 1");
                this.pkt1_Y = sc.nextInt();
            System.out.println("podaj wspX punktu 2");
                this.pkt2_X = sc.nextInt();
            System.out.println("podaj wspY punktu 2");
                this.pkt2_Y = sc.nextInt();
            System.out.println("podaj wspX punktu 3");
                this.pkt3_X = sc.nextInt();
            System.out.println("podaj wspY punktu 3");
                this.pkt3_Y = sc.nextInt();
    }

    public void wyznacznik(){
        int det;

        det = this.pkt1_X * this.pkt2_Y + this.pkt2_X * this.pkt3_Y + this.pkt3_X * this.pkt1_Y
                - this.pkt2_Y * this.pkt3_X - this.pkt3_Y * this.pkt1_X - this.pkt2_Y * this.pkt2_X;

        if (det > 0 ) {
            System.out.println("punkt c znajduje sie po lewej stronie wektora AB");
        }
        if (det == 0 ) {
            System.out.println("punkty sa wspolliniowe");
        }
        if (det < 0 ) {
            System.out.println("punkt c znajduje sie po prawej stronie wektora AB");
        }

    }
    public static void main(String[] args) {
    Main punkty = new Main();
        punkty.wyznacznik();
    }
}
