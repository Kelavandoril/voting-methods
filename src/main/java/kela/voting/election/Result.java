package kela.voting.election;

import lombok.Getter;

@Getter
public class Result implements Comparable<Result>{
    private Candidate candidate;
    private Integer votes;

    public Result(Candidate c) {
        this.candidate = c;
        this.votes = 0;
    }

    public void incrementVotes() {
        this.votes++;
    }

    @Override
    public int compareTo(Result o) {
        return o.votes.compareTo(this.votes);
    }
}
