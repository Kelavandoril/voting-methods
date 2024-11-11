package kela.voting.election;

import kela.voting.candidate.Candidate;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

public abstract class Election {
    @Getter @Setter
    private String title;
    @Getter @Setter
    private String description;
    private Set<Candidate> candidates;

    public Election() {
        candidates = new HashSet<>();
    }

    public Election(Set<Candidate> candidates) {
        this();
        this.candidates = candidates;
    }

    public void addCandidate(Candidate c) {
        candidates.add(c);
    }

    public void removeCandidate(Candidate c) {
        candidates.remove(c);
    }

    public String showCandidates() {
        StringBuilder sb = new StringBuilder();
        candidates.forEach(e -> sb.append(e.toString()).append("\n"));
        return sb.toString();
    }

    public abstract Set<Candidate> determineWinners();
}
