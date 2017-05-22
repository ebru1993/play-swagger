package models;


public class OrganisationUnit {

    public Integer id;
    public String organisationUnit;
    public String department;
    public Integer group1;
    public Integer group2;
    public Integer group3;
    public Integer group4;

    public OrganisationUnit(Integer id, String organisationUnit, String department, Integer group1,
        Integer group2, Integer group3, Integer group4) {
        this.id = id;
        this.organisationUnit = organisationUnit;
        this.department = department;
        this.group1 = group1;
        this.group2 = group2;
        this.group3 = group3;
        this.group4 = group4;
    }


}
