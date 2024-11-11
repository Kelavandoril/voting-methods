package kela.voting.ballot;

import kela.voting.election.Election;

import java.util.List;

public class Ballot {
    private List<Election> elections;

    public void addElection(Election e) {
        elections.add(e);
    }

    public void removeElection(Election e) {
        elections.remove(e);
    }

    public String showBallot() {
        StringBuilder sb = new StringBuilder();
        for (Election e : elections) {
            sb.append(e.getTitle()).append("\n");
            sb.append(e.getDescription()).append("\n");
            sb.append(e.showCandidates());
        }
        return sb.toString();
    }
}
