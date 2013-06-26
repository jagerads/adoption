package com.gerads.adoption.enumerations;

public enum FamilyMember {
	KAYLAH("Kaylah", "Jordan", "Mother", "kaylah_paddy"),
	JORDAN("Jordan", "Kaylah", "Father", "jordan"),
	PADRAIG("Padraig", "Jordan and Kaylah", "Puppy", "paddy"),
	;
	
	private final String name;
	private final String writtenBy;
	private final String position;
	private final String imgSrc;
	
	private FamilyMember(String name, String writtenBy, String position, String imgSrc) {
		this.name = name;
		this.writtenBy = writtenBy;
		this.position = position;
		this.imgSrc = imgSrc;
	}
	
	public String getName() {
		return name;
	}
	
	public String getWrittenBy() {
		return writtenBy;
	}
	
	public String getPosition() {
		return position;
	}
	
	public String getImgSrc() {
		return imgSrc;
	}
	
	public static FamilyMember fromValue(String name) {
		String lowerName = name.toLowerCase();
		
		for (FamilyMember familyMember : values()) {
			if (familyMember.getName().toLowerCase().equals(lowerName)) {
				return familyMember;
			}
		}
		
		throw new RuntimeException("No family member exists for the name " + name);
	}
}
