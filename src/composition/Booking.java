package composition;

public class Booking {
    private Member member;
    private trainingSession trainingSession;
    private boolean isActive;

    public Booking(Member member, trainingSession trainingSession){
        this.member = member;
        this.trainingSession = trainingSession;
        this.isActive = true;
    }

    public Member getMember(){
        return member;
    }

    public trainingSession getTrainingSession(){
        return trainingSession;
    }

    public void cancel(){
        if (isActive) {
            isActive = false;
            trainingSession.removeParticipant(member);
        }
    }

    public boolean isActive(){
        return isActive;
    }

    public void printBooking(){
        System.out.println("Member: " + member + " | Session: " + trainingSession + " Is active: " + isActive);
    }



}
