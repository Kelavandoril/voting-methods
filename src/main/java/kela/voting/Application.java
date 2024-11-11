package kela.voting;

import kela.voting.election.Candidate;
import kela.voting.election.Election;

import java.util.*;

public class Application {

    private static Map<String, Integer> candidateVotes;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean votingDone = false;
        List<Candidate> candidatesList = getCandidatesList();
        Election election = new Election(candidatesList);
        do {
            System.out.println("CANDIDATES");
            System.out.print(election.showCandidates());
            String input = scanner.nextLine();
            Candidate c = candidatesList.stream().filter(e -> input.equalsIgnoreCase(e.getName())).findFirst().orElse(null);
            if (!election.addVoteForCandidate(c))
                votingDone = true;
        } while (!votingDone);
        System.out.println("ELECTION OVER. RESULTS:");
        System.out.println(election.showResults());
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
