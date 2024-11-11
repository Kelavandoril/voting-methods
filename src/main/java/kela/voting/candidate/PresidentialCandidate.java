package kela.voting.candidate;

public class PresidentialCandidate extends PersonCandidate {
    private Candidate runningMate;

    public PresidentialCandidate(String name, Candidate runningMate) {
        super(name);
        this.runningMate = runningMate;
    }
}
