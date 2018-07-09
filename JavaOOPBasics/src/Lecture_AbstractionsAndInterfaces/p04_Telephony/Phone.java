package Lecture_AbstractionsAndInterfaces.p04_Telephony;

import java.util.ArrayList;
import java.util.List;

public class Phone implements Smartphone{
    private List<String> phoneNumbers = new ArrayList<>();
    private List<String> allSites = new ArrayList<>();

    public void setPhoneNumbers(String number) {
        this.phoneNumbers.add(number);
    }

    public void setAllSites(String site) {
        this.allSites.add(site);
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public List<String> getAllSites() {
        return allSites;
    }

    @Override
    public void Calling(List<String> numbers) {
        for (String num: numbers) {
            boolean havaChar = checkForChar(num);

            if (havaChar == true){
                System.out.println("Invalid number!");
            } else {
                System.out.printf("Calling... %s%n", num);
            }
        }
    }



    @Override
    public void Browsing(List<String> sites) {

        for (String st: sites) {
            boolean havaAdigit = checkForDigit(st);

            if (havaAdigit == true){
                System.out.println("Invalid URL!");
            } else {
                System.out.printf("Browsing: %s!%n", st);
            }
        }
    }

    private boolean checkForDigit(String st) {
        char[] letters = st.toCharArray();

        boolean bool = false;
        for (char letter : letters) {

           if (Character.isDigit(letter)){
               return true;
           }
        }
        return false;
    }

    private boolean checkForChar(String num) {
        char[] letters = num.toCharArray();

        for (char letter : letters) {
            if (Character.isLetter(letter)){
                return true;
            }
        }
       return false;
    }
}
