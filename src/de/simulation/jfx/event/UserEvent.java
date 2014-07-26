/**
 * 
 */
package de.simulation.jfx.event;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Random;

/**
 * @author ts
 *
 */
public class UserEvent {
	private String uid;
	private String gender;
	private int age;
	private Timestamp ts;

	/*
	 * For the simulation
	 */
	String[] testUid = { "uid1", "uid2", "uid3", "uid4", "uid5" };
	String[] testGender = { "M", "F" };
	//min age = 10, max age=75
	int[] testAge = { 10, 12, 15, 18, 24, 25, 30, 33, 35, 40, 44, 47, 50, 52,
			55, 57, 60, 65, 70, 75 };
	Random rand;

	/**
	 * Default constructor
	 */
	public UserEvent() {
		rand = new Random();
		int tempId =rand.nextInt(75);
		this.uid="uid_"+tempId;
		this.gender= testGender[(rand.nextInt(testGender.length))];
		this.age=tempId;
		Calendar calendar = Calendar.getInstance();
		Timestamp currentTimestamp = new java.sql.Timestamp(calendar.getTime().getTime());

		this.ts = currentTimestamp;

	}

	/**
	 * @param uid
	 * @param gender
	 * @param age
	 * @param ts
	 */
	public UserEvent(String uid, String gender, int age, Timestamp ts) {
		super();
		this.uid = uid;
		this.gender = gender;
		this.age = age;
		this.ts = ts;
	}

	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the ts
	 */
	public Timestamp getTs() {
		return ts;
	}

	/*
	 * toString method
	 */
	@Override
	public String toString() {
		return "UserEvent [uid=" + uid + ", gender=" + gender + ", age=" + age
				+ ", ts=" + ts + "]";
	}

}
