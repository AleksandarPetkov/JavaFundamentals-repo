package Lecture_AbstractionsAndInterfaces.p04_Telephony;

import java.util.List;

public interface Smartphone extends Searchabel {
    List<String> getPhoneNumbers();

    void setPhoneNumbers(String number);

    List<String> getAllSites();

    void setAllSites(String site);

    void Calling(List<String> numbers);


    void Browsing(List<String> sites);
}
