package com.clinic.pet.cnp.model;

import java.time.ZonedDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="pet_details")
public class PetProfile extends CollectionBase{
	
	private String name;
	private Species species;
	private String breed;
	private Gender gender;
	private boolean neutered;
	private double weight;
	private int age;
	private ObjectId parentId;
	private ZonedDateTime birthday;
	private PetColor petColor;
	
	public enum Species {
		DOG, CAT, HORSE, BIRD, RABBIT, REPTILE, AMPHIBIAN, FISH, OTHER
	}
	
	public enum Gender {
		MALE, FEMALE
	}
	
	public enum PetColor {
		BLACK, BROWN, GOLD, WHITE, CREAM, BLUE, GREY, RED, YELLOW, GREEN, ORANGE
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Species getSpecies() {
		return species;
	}

	public void setSpecies(Species species) {
		this.species = species;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public boolean isNeutered() {
		return neutered;
	}

	public void setNeutered(boolean neutered) {
		this.neutered = neutered;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ObjectId getParentId() {
		return parentId;
	}

	public void setParentId(ObjectId parentId) {
		this.parentId = parentId;
	}

	public ZonedDateTime getBirthday() {
		return birthday;
	}

	public void setBirthday(ZonedDateTime birthday) {
		this.birthday = birthday;
	}

	public PetColor getPetColor() {
		return petColor;
	}

	public void setPetColor(PetColor petColor) {
		this.petColor = petColor;
	}

}
