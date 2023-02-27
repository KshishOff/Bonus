public class Main {
    public static void main(String[] args) {

        int account = 334;
        int replen = 1232;
        int bonus;
        if (replen > 1000) {
            bonus = replen / 100;
        } else {
            bonus = 0;
        } account = account + replen + bonus;
        System.out.println("На вашем счету: " + account + " рублей");
        System.out.println("Начислено бонусов: " + bonus + " рублей");

    }
}