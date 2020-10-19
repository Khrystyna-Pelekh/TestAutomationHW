package com.pelekh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat dateFormat = new SimpleDateFormat("mm:ss");
        DecimalFormat df = new DecimalFormat("#.##");
        double c1, c2, c3;
        Date t1, t2, t3;
        double cost1, cost2, cost3;

        System.out.print("Enter c1 standard units per minute: ");
        c1 = Double.parseDouble(bufferedReader.readLine());
        System.out.print("How many minutes talk continued? ");
        t1 = dateFormat.parse(bufferedReader.readLine());
        cost1 = c1 * (t1.getMinutes() + t1.getSeconds() / 60.0);
        System.out.println("Cost of first call: " + df.format(cost1));

        System.out.print("Enter c2 standard units per minute: ");
        c2 = Double.parseDouble(bufferedReader.readLine());
        System.out.print("How many minutes talk continued? ");
        t2 = dateFormat.parse(bufferedReader.readLine());
        cost2 = c2 * (t2.getMinutes() + t2.getSeconds() / 60.0);
        System.out.println("Cost of second call: " + df.format(cost2));

        System.out.print("Enter c3 standard units per minute: ");
        c3 = Double.parseDouble(bufferedReader.readLine());
        System.out.print("How many minutes talk continued? ");
        t3 = dateFormat.parse(bufferedReader.readLine());
        cost3 = c3 * (t3.getMinutes() + t3.getSeconds() / 60.0);
        System.out.println("Cost of third call: " + df.format(cost3));

        System.out.println("\nAll talk together: " + df.format(cost1 + cost2 + cost3));

    }
}
