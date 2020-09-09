package String;

public class MultiplyStrings {
    public static void main(String[] args) {
        MultiplyStrings multiplyStrings = new MultiplyStrings();
        String multiply = multiplyStrings.getProduct("2456", "3");
    }

    private String getProduct(String no1, String no2) {

        int result1 = 0;
        int result2 = 0;


        if (no1.length() < 110 && no2.length() < 110) {
            if (no1.matches("\\d+") && no2.matches("\\d+")) {
                
                for (int i = 0; i < no1.length(); i++) {
                    result1 = result1 * 10 + no1.charAt(i) - '0';
                }
                for (int j = 0; j < no2.length(); j++) {
                    result2 = result2 * 10 + no2.charAt(j) - '0';
                }
            }
        }

        return "";
    }

    public boolean checkZero(String no1,String no2){
        boolean allZero=true;
        for (int i=0;i<no1.length() && allZero;i++)
        {
            if (no1.charAt(i)!='0'|| no2.charAt(i)!='0')
                allZero = false;
        }
        return allZero;
    }
}
