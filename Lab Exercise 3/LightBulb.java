public class LightBulb {
     public static void main(String[] args) {
        int watts = 60; // Example wattage. You can change this.
        int lumens;

        switch (watts) {
            case 15:
                lumens = 125;
                break;
            case 25:
                lumens = 215;
                break;
            case 40:
                lumens = 500;
                break;
            case 60:
                lumens = 880;
                break;
            case 75:
                lumens = 1000;
                break;
            case 100:
                lumens = 1675;
                break;
            default:
                lumens = -1; // Default case for watts not in the table
                break;
        }

        System.out.println("Watts: " + watts);
        System.out.println("Lumens: " + lumens);
    }
}
