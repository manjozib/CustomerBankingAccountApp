import java.util.Random;

public class GenerateAccountNumber {

    public static String accountNumber(String accountType, String sSNumber) {

        String firstDigit;

        //generating 5 unique digit number
        Random fiveDigit = new Random( System.currentTimeMillis() );
        int i = ((1 + fiveDigit.nextInt(2)) * 10000 + fiveDigit.nextInt(10000));
        String s = String.valueOf(i);

        //generating 3 didgit random number
        Random threeDigit = new Random();
        int x = threeDigit.nextInt(999);
        String s2 = String.valueOf(x);

        // determining for type of account
        //if its savings it account Number start with 1 its is savings
        // if its start with 2 its a checkings
        if (accountType.toLowerCase().equals("savings")) {

            firstDigit = "1";
        } else {
            firstDigit = "2";
        }

        String accountNo = firstDigit + sSNumber.substring(sSNumber.length()-2) + s + s2;
        return accountNo;

    }
}

