package assemble;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ComplexUser {
    private String name;
    private List<String> hobbyList;
    private Map<String, String> residenceMap;
    private Set<String> aliasSet;
    private String[] array;

    public ComplexUser() {
    }

    public ComplexUser(String name, List<String> hobbyList, Map<String, String> residenceMap, Set<String> aliasSet, String[] array) {
        this.name = name;
        this.hobbyList = hobbyList;
        this.residenceMap = residenceMap;
        this.aliasSet = aliasSet;
        this.array = array;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

    public Map<String, String> getResidenceMap() {
        return residenceMap;
    }

    public void setResidenceMap(Map<String, String> residenceMap) {
        this.residenceMap = residenceMap;
    }

    public Set<String> getAliasSet() {
        return aliasSet;
    }

    public void setAliasSet(Set<String> aliasSet) {
        this.aliasSet = aliasSet;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }


    @Override
    public String toString() {
        return "ComplexUser{" +
                "name='" + name + '\'' +
                ", hobbyList=" + hobbyList +
                ", residenceMap=" + residenceMap +
                ", aliasSet=" + aliasSet +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
