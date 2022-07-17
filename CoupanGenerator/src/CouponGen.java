public class CouponGen {
    public static void main(String[] args) {
        System.out.println("Random Coupon Generator");
        char[] Chars = "abcdefghijklmnopqrstuvwxyz1234567890".toCharArray();
        int last = 1000000;
        double d = Math.random();
        int random =(int)(d* last);
        String sb ="";

        while (random > 0) {
            sb = sb + (Chars[random % Chars.length]);
            random /= Chars.length;
            System.out.println(random + " " + random % Chars.length + "sb is" + sb);
        }
        String couponCode =sb.toString();
        System.out.println("Coupon Code is : " + couponCode);
        }
    }
