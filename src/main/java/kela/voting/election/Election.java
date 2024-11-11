package kela.voting.election;

import kela.voting.schemes.plurality.PluralityScheme;
import kela.voting.schemes.Scheme;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Election {
    private final List<Result> results;
    @Getter
    private Candidate winner;
    private Scheme electionScheme;

    public Election() {
        results = new ArrayList<>();
        winner = null;
        electionScheme = new PluralityScheme();
    }

    public Election(List<Candidate> candidates) {
        this();
        candidates.forEach(c -> results.add(new Result(c)));
    }

    public Election(List<Candidate> candidates, Scheme scheme) {
        this(candidates);
        this.electionScheme = scheme;
    }

    public boolean addVoteForCandidate(Candidate c) {
        Result r = results.stream().filter(e -> e.getCandidate().equals(c)).findFirst().orElse(null);
        if (r != null) {
            r.incrementVotes();
            return true;
        }
        return false;
    }

    public String showResults() {
        StringBuilder sb = new StringBuilder();
        Collections.sort(results);
        Result winner = results.get(0);
        for (Result r : results) {
            sb.append(r.getCandidate().getName()).append(" : ").append(r.getVotes()).append("\n");
        }
        sb.append("WINNER(S):").append("\n");
        List<Candidate> winners = electionScheme.determineWinner(results);
        for (int i=0; i<winners.size(); i++) {
            Candidate c = winners.get(i);
            sb.append(i+1).append(". ").append(c.getName()).append("\n");
        }
        return sb.toString();
    }

    public String showCandidates() {
        StringBuilder sb = new StringBuilder();
        for (Result key : results) {
            String candidateName = key.getCandidate().getName();
            sb.append(candidateName).append("\n");
        }
        return sb.toString();
    }
}
