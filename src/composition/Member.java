package composition;

import java.util.ArrayList;

public class Member {
    private String name;
    private int memberId;
    private ArrayList<String> bookings;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName(){
        return this.name;
    }

    public int getMemberId() {
        return this.memberId;
    }

//    public ArrayList<Booking> getBookings() {
//        return this.bookings;
//    }

    public void AddBooking(String booking) {
        bookings.add(booking);
    }

    public void printBookings() {
        System.out.println("== Your Bookings ==");
        for(String booking : bookings) {
            System.out.println(booking);
        }
    }

    public int getActiveBookingCount() {
        int count = 0;
        for(String booking : bookings) {
            count++;
        }

        return count;
    }


}
