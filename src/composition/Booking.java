package composition;

public class Booking {
    private Member member;
    private TrainingSession trainingSession;
    private boolean isActive;

    public Booking(Member member, TrainingSession trainingSession){
        this.member = member;
        this.trainingSession = trainingSession;
        this.isActive = true;
    }

    public Member getMember(){
        return member;
    }

    public TrainingSession getTrainingSession(){
        return trainingSession;
    }

    public void cancel(){

    }

    public boolean isActive(){
        return isActive;
    }

    public void printBooking(){
        System.out.println("Member: " + member + " | Session: " + trainingSession + " Is active: " + isActive);
    }



}
