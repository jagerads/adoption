package com.gerads.adoption.enumerations;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.ImmutableMap.Builder;
import com.google.common.collect.Sets;

public enum Video {
	OH_BO("Bo Burnham - Oh Bo", "dcLFmN7aJe0"),
	HIGH_SCHOOL_PARTY("Bo Burnham - High School Party", "eeO7COzVWnk"),
	WORDS_WORDS_WORDS("Bo Burnham - Words, Words, Words", "iuF6CpML3IQ"),
	BITTERSWEET("Ellie Goulding - Bittersweet", "YysA79k4gfY"),
	;
	
	private final String title;
	private final String linkText;
	
	private static final Map<String, Video> videosByLinkText;
	
	static {
		Builder<String, Video> builder = new Builder<>();
		
		for (Video video : values()) {
			builder.put(video.linkText, video);
		}
		
		videosByLinkText = builder.build();
	}
	
	private Video(String title, String linkText) {
		this.title = title;
		this.linkText = linkText;
	}
	
	public String getTitle() {
		return title;
}
	
	public String getLinkText() {
		return linkText;
	}
	
	public static Video fromLinkText(String linkText) {
		if (!videosByLinkText.containsKey(linkText)) {		
			throw new RuntimeException("No video exists for the link text " + linkText);
		}
		
		return videosByLinkText.get(linkText);
	}
	
	public static Set<Video> otherVideos(Video video) {
		Set<Video> videos = Sets.newHashSet(values());

		videos.remove(video);
		
		return videos;
	}
}
