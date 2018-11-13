package com.company;

public class NarodniBuditeli {
    public static void main(String[] args) {
        String narodni = new String("НАРОДНИ");
        String buditeli = new String("БУДИТЕЛИ");
        String result, resultBuditeli;
        int i, count2 = 1, len1 = narodni.length(), len2 = buditeli.length();
        int count = 1;

        result = narodni;
        resultBuditeli = buditeli;
        System.out.print(result);
        System.out.print("  ");
        System.out.println(resultBuditeli);
        while (true) {


            for (i = 0; i < len2; i++) {
                result = shiftString(result, len1);
                resultBuditeli = shiftString(resultBuditeli, len2);
                count++;
                System.out.print(result);
                System.out.print("  ");
                System.out.println(resultBuditeli);
                if ((result.equals(narodni)) && (resultBuditeli.equals(buditeli))) break;

            }

            if ((result.equals("НАРОДНИ")) && (resultBuditeli.equals("БУДИТЕЛИ"))) {
                System.out.format("\n Отговорът е  %s:\n", count);
                break;
            }
        }
    }

    private static String shiftString(String narodniBuditeli, int len) {
        return narodniBuditeli.charAt(len - 1) + narodniBuditeli.substring(0, len - 1);
    }
}
