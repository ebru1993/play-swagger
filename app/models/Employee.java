package models;


import java.sql.Date;

public class Employee {

    public Integer id;
    public Salutation salutation;
    public String lastname;
    public String firstname;
    public Date dateOfBirth;
    public String co;
    public String street;
    public Integer zip;
    public String city;
    public String phonePrivate;
    public String phoneMobile;
    public String email;
    public OrganisationUnit organisationUnit;
    public Function function;
    public Title title;
    public String telephone;
    public String dect;
    public Date startDate;
    public Date endDate;
    public Date identityCard;

    public Employee(Integer id, Salutation salutation, String lastname, String firstname,
        Date dateOfBirth, String co, String street, Integer zip, String city, String phonePrivate,
        String phoneMobile, String email, OrganisationUnit organisationUnit, Function function,
        Title title, String telephone, String dect, Date startDate, Date endDate,
        Date identityCard) {
        this.id = id;
        this.salutation = salutation;
        this.lastname = lastname;
        this.firstname = firstname;
        this.dateOfBirth = dateOfBirth;
        this.co = co;
        this.street = street;
        this.zip = zip;
        this.city = city;
        this.phonePrivate = phonePrivate;
        this.phoneMobile = phoneMobile;
        this.email = email;
        this.organisationUnit = organisationUnit;
        this.function = function;
        this.title = title;
        this.telephone = telephone;
        this.dect = dect;
        this.startDate = startDate;
        this.endDate = endDate;
        this.identityCard = identityCard;
    }
}
