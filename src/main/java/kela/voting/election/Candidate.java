package kela.voting.election;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Candidate implements Comparable<Candidate> {
    private String name;
    private String party;

    public Candidate(String name) {
        this.name = name;
        this.party = "Independent";
    }

    @Override
    public int compareTo(Candidate o) {
        return this.name.compareTo(o.name);
    }
}
