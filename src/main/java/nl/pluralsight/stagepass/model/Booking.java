package nl.pluralsight.stagepass.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Customer name cannot be blank")
    private String customerName;

    @NotBlank(message = "Customer email cannot be blank")
    @Email(message = "Must be a valid email address")
    private String customerEmail;

    @ManyToOne
    @JoinColumn(name = "concert_id")
    private Concert concert;

    @NotNull(message = "Number of tickets is required")
    @Min(value = 1, message = "You must book at least 1 ticket")
    @Max(value = 10, message = "You cannot book more than 10 tickets")
    private int numberOfTickets;

    private BigDecimal totalPrice;

    private LocalDate bookingDate;

    public Booking() {}

    public Booking(Long id, String customerName, String customerEmail, Concert concert,
                   int numberOfTickets, BigDecimal totalPrice, LocalDate bookingDate) {
        this.id = id;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.concert = concert;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
        this.bookingDate = bookingDate;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getCustomerEmail() { return customerEmail; }
    public void setCustomerEmail(String customerEmail) { this.customerEmail = customerEmail; }

    public Concert getConcert() { return concert; }
    public void setConcert(Concert concert) { this.concert = concert; }

    public int getNumberOfTickets() { return numberOfTickets; }
    public void setNumberOfTickets(int numberOfTickets) { this.numberOfTickets = numberOfTickets; }

    public BigDecimal getTotalPrice() { return totalPrice; }
    public void setTotalPrice(BigDecimal totalPrice) { this.totalPrice = totalPrice; }

    public LocalDate getBookingDate() { return bookingDate; }
    public void setBookingDate(LocalDate bookingDate) { this.bookingDate = bookingDate; }
}
