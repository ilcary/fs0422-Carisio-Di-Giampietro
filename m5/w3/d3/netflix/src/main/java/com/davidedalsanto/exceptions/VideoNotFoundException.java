package com.davidedalsanto.exceptions;

public class VideoNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VideoNotFoundException() {
		super("No video found with this ID");
	}
}
