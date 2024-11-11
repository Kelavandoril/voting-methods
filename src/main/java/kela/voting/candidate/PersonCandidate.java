package kela.voting.candidate;

public class PersonCandidate implements Comparable<PersonCandidate> {
    private String name;
    private String party;

    public PersonCandidate(String name) {
        this.name = name;
        this.party = "Independent";
    }

    @Override
    public String toString() {
        return name + " - " + party;
    }

    @Override
    public int compareTo(PersonCandidate o) {
        return this.name.compareTo(o.name);
    }
}
