package kela.voting;

import kela.voting.candidate.Candidate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Application {

    private static Map<String, Integer> candidateVotes;


    public static void main(String[] args) {
        List<Candidate> candidates = getCandidatesList();
    }

    public static List<Candidate> getCandidatesList() {
        ArrayList<Candidate> candidatesList = new ArrayList<>();
        Candidate candidate = new Candidate("John Doe");
        Candidate candidate1 = new Candidate("Jane Doe");
        Candidate candidate2 = new Candidate("Zachary Smith");
        Candidate candidate3 = new Candidate("George Stevens");
        candidatesList.add(candidate);
        candidatesList.add(candidate1);
        candidatesList.add(candidate2);
        candidatesList.add(candidate3);
        return candidatesList;
    }
}
