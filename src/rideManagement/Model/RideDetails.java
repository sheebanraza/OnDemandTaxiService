package rideManagement.Model;

import memberManagement.service.Customer;
import memberManagement.service.Driver;

import javax.persistence.*;

/**
 * Created by sheebanshaikh on 8/13/16.
 */

@Entity
public class RideDetails {

    @Id
    @GeneratedValue
    private Long rideDetailsId;

    @Column
    private String source;

    @Column
    private String destionation;

    @OneToOne
    private Customer customer;

    @OneToOne
    private Driver driver;

    @Column
    private RideStatus rideStatus;


    public RideDetails(String source, String destionation, Customer customer, Driver driver, RideStatus rideStatus) {
        this.source = source;
        this.destionation = destionation;
        this.customer = customer;
        this.driver = driver;
        this.rideStatus = rideStatus;
    }

    public Long getRideDetailsId() {
        return rideDetailsId;
    }

    public String getSource() {
        return source;
    }

    public String getDestionation() {
        return destionation;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Driver getDriver() {
        return driver;
    }

    public RideStatus getRideStatus() {
        return rideStatus;
    }
}
