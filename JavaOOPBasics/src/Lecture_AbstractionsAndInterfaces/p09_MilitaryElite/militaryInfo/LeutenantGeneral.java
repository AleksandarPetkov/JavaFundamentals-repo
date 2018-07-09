package Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.militaryInfo;
import Lecture_AbstractionsAndInterfaces.p09_MilitaryElite.interfaces.ILeutenantGeneral;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LeutenantGeneral extends Private implements ILeutenantGeneral{
    private Set<Private> privates;

    public LeutenantGeneral(String firstName, String lastName, String id, double salary, Set<Private> privates) {
        super(firstName, lastName, id, salary);
        this.privates = privates;
    }

    public Set<Private> getPrivates() {
        return this.privates;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString()).append(System.lineSeparator());
        sb.append("Privates:");  // Create sb and append superToString

        Set<Private> sortedPrivates = this.privates // Sorted by Id
                .stream()
                .sorted((p1, p2) -> p2.getId().compareTo(p1.getId()))
                .collect(Collectors.toCollection(LinkedHashSet::new)); // Collect to LinkenHashSet

        for (Private privateSoldier : sortedPrivates) { // Iter by all elements and appent in sb
            sb.append(System.lineSeparator()).append("  " + privateSoldier);
        }

        return sb.toString();
    }
}
