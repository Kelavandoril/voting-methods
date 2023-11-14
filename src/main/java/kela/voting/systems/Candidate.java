package kela.voting.systems;

public enum Candidate {
    A(null),
    B(null),
    C(null),
    D(null),
    E(null),
    F(null),
    G(null),
    H(null),
    I(null),
    J(null);

    private final String candidateName;

    public String getCandidateName() {
        return candidateName;
    }

    Candidate(String candidateName) {
        this.candidateName = candidateName;
    }
}
