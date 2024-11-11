package kela.voting.candidate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Candidate {
    private String name;

    public Candidate(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
