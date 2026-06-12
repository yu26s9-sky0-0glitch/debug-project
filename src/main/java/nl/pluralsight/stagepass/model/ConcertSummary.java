package nl.pluralsight.stagepass.model;

import java.math.BigDecimal;

public class ConcertSummary {
    private Long concertId;
    private  String concertTitle;
    private  int totalSeat;
    private int seatBooked;
    private int availableSeat;
    private BigDecimal totalRevenue;

    public ConcertSummary(Long concertId, String concertTitle, int totalSeat, int seatBooked, int availableSeat, BigDecimal totalRevenue) {
        this.concertId = concertId;
        this.concertTitle = concertTitle;
        this.totalSeat = totalSeat;
        this.seatBooked = seatBooked;
        this.availableSeat = availableSeat;
        this.totalRevenue = totalRevenue;
    }

    public Long getConcertId() {
        return concertId;
    }

    public void setConcertId(Long concertId) {
        this.concertId = concertId;
    }

    public String getConcertTitle() {
        return concertTitle;
    }

    public void setConcertTitle(String concertTitle) {
        this.concertTitle = concertTitle;
    }

    public int getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(int totalSeat) {
        this.totalSeat = totalSeat;
    }

    public int getSeatBooked() {
        return seatBooked;
    }

    public void setSeatBooked(int seatBooked) {
        this.seatBooked = seatBooked;
    }

    public int getAvailableSeat() {
        return availableSeat;
    }

    public void setAvailableSeat(int availableSeat) {
        this.availableSeat = availableSeat;
    }

    public BigDecimal getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(BigDecimal totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
}
