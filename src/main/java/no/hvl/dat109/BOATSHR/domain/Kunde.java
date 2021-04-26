package no.hvl.dat109.BOATSHR.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Kunde {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String address;

    @NotNull
    private int nmr;

    @NotNull
    private String email;

    @NotNull
    private String password;
    private String matchingPassword;


    private int credit;

    @ManyToOne
    @JoinTable(name = "selskap_Kunde", joinColumns = @JoinColumn(name = "kunde_id"),
            inverseJoinColumns = @JoinColumn(name = "selskap_id"))
    private Set<Selskap> selskap;

    public Kunde() {
    }

    public Kunde(Long id, String firstName, String lastName, String address, int nmr, String email, int credit, String password, String matchingPassword) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.nmr = nmr;
        this.email = email;
        this.credit = credit;
        this.password = password;
        this.matchingPassword = matchingPassword;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMatchingPassword() {
        return matchingPassword;
    }

    public void setMatchingPassword(String matchingPassword) {
        this.matchingPassword = matchingPassword;
    }

    public Set<Selskap> getSelskap() {
        return selskap;
    }

    public void setSelskap(Set<Selskap> selskap) {
        this.selskap = selskap;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNmr() {
        return nmr;
    }

    public void setNmr(int nmr) {
        this.nmr = nmr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }



}
