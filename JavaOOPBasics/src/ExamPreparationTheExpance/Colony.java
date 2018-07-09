package ExamPreparationTheExpance;

import ExamPreparationTheExpance.colonist.Colonist;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Colony {
    private int maxFamilyCount;
    private int maxFamilyCapacity;
    private Map<String, List<Colonist>> allFamily;

    public Colony(int maxFamilyCount, int maxFamilyCapacity) {
        this.maxFamilyCount = maxFamilyCount;
        this.maxFamilyCapacity = maxFamilyCapacity;
        this.allFamily = new LinkedHashMap<>();
    }

    public List<Colonist> getColonistsByFamilyId(String familyId) {
        return null;
    }

    public int getMaxFamilyCount() {
        return this.maxFamilyCount;
    }

    public int getMaxFamilyCapacity() {
        return this.maxFamilyCapacity;
    }

    public void addColonist(Colonist colonist) {

        if (!allFamily.containsKey(colonist.getFamilyId())) {
            if (allFamily.size() + 1 > maxFamilyCount) {
                throw new IllegalArgumentException("colony is full");
            }

            allFamily.put(colonist.getFamilyId(), new ArrayList<>());
            allFamily.get(colonist.getFamilyId()).add(colonist);
        } else {
            int currentFamilyCap = allFamily.get(colonist.getFamilyId()).size();
            if (currentFamilyCap >= maxFamilyCapacity) {
                throw new IllegalArgumentException("family is full");
            } else {
                allFamily.get(colonist.getFamilyId()).add(colonist);
            }
        }

    }

    public void removeColonist(String familyId, String memberId) {
        for (Colonist currentColonist : allFamily.get(familyId)) {
            if (currentColonist.getId().equals(memberId)) {
                allFamily.get(familyId).remove(currentColonist);
                break;
            }
        }
    }

    public void removeFamily(String id) {
        allFamily.remove(id);
    }

    public void grow(int years) {
        for (List<Colonist> colonists : allFamily.values()) {
            for (Colonist colonist : colonists) {
                colonist.setAge(years);
            }
        }
    }

    public int getPotential() {
        int colonyPotention = 0;

        for (List<Colonist> colonists : allFamily.values()) {
            for (Colonist colonist : colonists) {
                colonyPotention += colonist.getPotential() + colonist.getTalent();
            }
        }
        return colonyPotention;
    }

//    families: 2/2
    public String getCapacity() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("families: %d/%d%n",allFamily.size(), maxFamilyCount));

         allFamily.entrySet().stream().sorted((x1,x2) -> {
            int comp = x1.getKey().compareTo(x2.getKey());
            return comp;

        }).forEach(x -> sb.append(String.format("-%s: %d/%d%n",x.getKey(),x.getValue().size(), maxFamilyCapacity)));
        return  sb.toString();
    }

    public String family(String familyId){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s:%n",familyId));

        for (List<Colonist> colonists : allFamily.values()) {
            colonists.stream().sorted((x1,x2) -> {
               int comp = x1.getId().compareTo(x2.getId());
               return comp;
            }).forEach(x ->  sb.append(String.format("-%s: %d%n",x.getId(), getPotential())));
        }
        return sb.toString();
    }

    //////////////////////

}
