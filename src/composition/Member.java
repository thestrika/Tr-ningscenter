package composition;

import java.util.ArrayList;

public class Member {
    private String name;
    private int memberId;
    private ArrayList<Booking> bookings;
    private String memberType;
    private int maxBookings;
    private double monthlyPrice;

    public Member(String name, int memberId, String memberType) {
        this.name = name;
        this.memberId = memberId;
        if(memberType.equals("free")) {
            this.maxBookings = 5;
            this.monthlyPrice = 0;
        } else if (memberType.equals("premium")) {
            this.maxBookings = 20;
            this.monthlyPrice = 4.99;
        }
    }

    public String getName(){
        return this.name;
    }

    public int getMemberId() {
        return this.memberId;
    }

    public void AddBooking(Booking booking) {
        bookings.add(booking);
    }

    public void printBookings() {
        System.out.println("== Bookings ==");
        System.out.println("Number of bookings: " + bookings.size() + "/" + this.maxBookings);
        for(Booking booking : bookings) {
            booking.printBooking();
        }
    }

    public int getActiveBookingCount() {
        int count = 0;
        for(Booking booking : bookings) {
            count++;
        }

        return count;
    }

    public Booking findActiveBooking(trainingSession session) {
        for(Booking booking : bookings) {
            if(booking.getTrainingSession() == session) {
                return booking;
            }
        }
        return null;
    }

    public boolean hasBooked(trainingSession session) {
        for(Booking booking : bookings) {
            if(booking.getTrainingSession() == session) {
                return true;
            }
        }
        return false;
    }

    public boolean hasReachedMaxBooking() {
        return bookings.size() > maxBookings;
    }

    public String getMemberType() {
        return this.memberType;
    }

    public void printMember() {
        System.out.println("==== " + this.name + " ====");
        System.out.println("ID: " + this.memberId);
        System.out.println("Subscription: " + this.memberType);
        System.out.println("Monthly price: " + this.monthlyPrice);
    }
}
