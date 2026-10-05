package composition;
import java.util.ArrayList;

public class trainingSession {

    private String title;
    private String instructor;
    private int capacity;
    private ArrayList<Member> participants;

    // Constructor
    public trainingSession(String title, String instructor, int capacity) {
        this.title = title;
        this.instructor = instructor;
        this.capacity = capacity;
        this.participants = new ArrayList<>();
    }

    // Getters

    public String getTitle() {
        return title;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getCapacity() {
        return capacity;
    }

    // checking if there is enough space

    public boolean hasAvailableSpace() {
        return participants.size() < capacity;
    }

    // returns number of avaliable spaces
    public int getAvailableSpaces() {
        return capacity - participants.size();
    }


    // Adds a participant if there is space and they are not already registered
    public boolean addParticipant(Member member) {
        if (hasAvailableSpace() && !participants.contains(member)) {
            participants.add(member);
            return true;
        }

        return false;
    }

    // removes a participant

    public boolean removeParticipant (Member member) {
        return participants.remove(member);
    }

    public void printSession () {
        System.out.println(("Titel: " + title));
        System.out.println("Instructor: " + instructor);
        System.out.println("Number of participants: " + participants.size());
        System.out.println("Availiable Spaces: " + getAvailableSpaces());
    }

}