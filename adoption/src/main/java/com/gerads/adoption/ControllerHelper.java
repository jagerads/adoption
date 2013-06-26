package com.gerads.adoption;

import java.util.Map;

import com.gerads.adoption.enumerations.FamilyMember;
import com.google.common.collect.ImmutableBiMap.Builder;

public class ControllerHelper {
	private static final Map<FamilyMember, String[]> familyMemberToDescriptions;
	private static final Map<FamilyMember, String[]> familyMemberToReasons;
	
	private static final String[] JORDAN_DESCRIPTIONS = {
		"Jordan is the most intelligent man I have ever met.",
		"He works as a software developer for a great company.",
		"He is a nerd at heart and is not ashamed at all.",
		"His favorite hobbies include working on computers, playing board games with family, watching sports, " +
				"attending sporting events with his dad, playing with his niece and nephew and last but not least " +
				"eating macaroni and cheese.",
		"He is the person that will remember you ten years down the road, even if he has only met you once.",
		"He genuinely cares about everyone and will do everything he can to make someone's day better even at " +
				"his own expense.",
	};
	
	private static final String[] JORDAN_REASONS = {
		"Jordan is the most genuine loving man I have ever met.",
		"He would be the father that will be at his children's bedside when they are having nightmares, he " +
				"will be the father that will take the time out of his day to play games, read books, make cookies.",
		"He will be the father that will pick his child up when they fall whether it was their fault or not.",
		"He will be the father that would play dress up, or play sports.",
		"He will be the goofy father every child is embarrassed about when they are younger, but appreciates " +
				"when they are older.",
	};
	
	private static final String[] KAYLAH_DESCRIPTIONS = {
		"Kaylah is without a doubt the most loving and caring person I know.",
		"She's always willing to help others out when they need a hand, even if they are strangers.",
		"This has helped her to be extremely successful both in relationships with friends and family " +
				"and in her professional life as a loan document specialist, where she always takes the extra " +
				"step to ensure she's doing everything she can to help people get into the home of their dreams.",
		"She's always been a selfless person, attending to others' wants and needs before considering her own.",
		"She loves playing games, and is always eager to sit down and play board, card, or dice games, even the " +
				"occasional video game.",
		"She's an outgoing people person who loves spending every moment with her family and friends, but never " +
				"afraid to reach out and say hello to someone new.",
	};

	private static final String[] KAYLAH_REASONS = {
		"I know that Kaylah will love our children more than anything in the world.",
		"Her first thought every morning and last thought every night will be making sure she's done everything " +
				"she possibly can as a mother to provide for her children and make sure they're as happy as they can be.",
		"She will be the classic soccer mom, catering to her kids and their friends, busing them to sporting events " +
				"and birthday parties, and loving every minute of it.",
		"She would never be afraid to help her child through tough times, always being a best friend for them when they " +
				"need it most. She will be the perfect role model for our children, and will always be someone they can " +
				"look up to.",
	};
	
	private static final String[] PADRAIG_DESCRIPTIONS = {
		"Padraig is our teacup yorkie. He is a little over a year-and-a-half old.",
		"We've had him since he was six weeks old and have loved him dearly since he joined our family.",
		"Paddy (as we call him) is a fun-loving puppy who enjoys playing with anyone who has time to spare.",
		"He's never afraid to grab a toy to play catch with someone or make sure that a visitor's face is impeccably clean.",
		"His favorite toys are squeaky animals (his favorite is a blue platypus,) chewy bones, and Jordan's green laser " +
				"pointer.",
		"In his free time, Paddy enjoys sleeping, eating, and following us around the house.",
	};
	
	private static final String[] PADRAIG_REASONS = {
		"Padraig is the perfect puppy to be around children.", 
		"He only weighs about five pounds and is barely taller than the grass in our yard!",
		"He doesn't bite, he rarely barks (except to alert us that the doorbell rang) and he's incredibly cuddly.",
		"He loves playing with everyone in the family, including his cousins Braelynne and Kale as well as all his aunts, " +
				"uncles, and grandparents.",
		"As a yorkie, he's also hypoallergenic, so he poses no threat to visitors and family members with allergies.",
		"In short, Paddy will make an excellent big brother for any child we would be lucky enough to have become " +
				"a part of our family!",
	};
	
	static {
		Builder<FamilyMember, String[]> descriptionBuilder = new Builder<FamilyMember, String[]>();
		
		descriptionBuilder.put(FamilyMember.KAYLAH,  KAYLAH_DESCRIPTIONS);
		descriptionBuilder.put(FamilyMember.JORDAN,  JORDAN_DESCRIPTIONS);
		descriptionBuilder.put(FamilyMember.PADRAIG, PADRAIG_DESCRIPTIONS);
		
		familyMemberToDescriptions = descriptionBuilder.build();

		Builder<FamilyMember, String[]> reasonBuilder = new Builder<FamilyMember, String[]>();
		
		reasonBuilder.put(FamilyMember.KAYLAH,  KAYLAH_REASONS);
		reasonBuilder.put(FamilyMember.JORDAN,  JORDAN_REASONS);
		reasonBuilder.put(FamilyMember.PADRAIG, PADRAIG_REASONS);
		
		familyMemberToReasons = reasonBuilder.build();
	}
	
	public static String[] getDescriptionsForFamilyMember(FamilyMember familyMember) {
		return familyMemberToDescriptions.get(familyMember);
	}
	
	public static String[] getReasonsForFamilyMember(FamilyMember familyMember) {
		return familyMemberToReasons.get(familyMember);
	}
}
