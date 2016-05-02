package ca.ubc.cs.cpsc210.meetup.model;

import java.util.Set;

/**
 * Represent a student who takes courses
 */
public class Student {

	// Data about a student
	private String lastName;
	private String firstName;
	private int id;
	private Schedule schedule;

	/**
	 * Constructor 
	 * REQUIRES: lastName is not null, firstName is not null and id > 0
	 * EFFECTS: Object is initialized
	 */
	public Student(String lastName, String firstName, int id) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.id = id;
		schedule = new Schedule();
	}

	// **************** Getters ****************s
	public Schedule getSchedule() {
		return schedule;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (id != student.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }

    public String toString() {
        return id + " " + firstName + " " + lastName;

    }

}
