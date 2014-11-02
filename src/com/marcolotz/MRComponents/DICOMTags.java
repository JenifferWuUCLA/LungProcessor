/*******************************************************************************
 * Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International
 * 
 * Copyright (c) 2014 Marco Aurelio Barbosa Fagnani Gomes Lotz (marcolotz.com)
 * 
 * The source code in this document is licensed under Creative Commons
 * Attribution-NonCommercial-ShareAlike 4.0 International License. You must 
 * credit the author of the source code in the way specified by the author or
 * licenser (but not in a way to suggest that the author or licenser has given 
 * you allowance to you or to your use of the source code). If you modify,
 * transform or create using this source code as basis, you can only distribute
 * the new source code under the same license or a similar license to this one.
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * To see a copy of the license, access:
 * creativecommons.org/licenses/by-nc-sa/4.0/legalcode
 ******************************************************************************/
package com.marcolotz.MRComponents;

/**
 * This class contains all the DICOM tags address used by this application
 * 
 * @author Marco Aurelio Lotz
 * 
 */
public abstract class DICOMTags {

	public static final String SOPClassUID = "0008,0016";

	// Unique identifier for the image.
	public static final String SOPInstanceUID = "0008,0018";

	public static final String StudyDate = "0008,0020";
	public static final String SeriesDate = "0008,0021";
	public static final String ImageDate = "0008,0023";

	public static final String StudyTime = "0008,0030";
	public static final String SeriesTime = "0008,0031";
	public static final String ImageTime = "0008,0033";

	public static final String Modality = "0008,0060";

	public static final String Manufacturer = "0008,0070";
	public static final String InstitutionName = "0008,0080";
	public static final String InstitutionAddress = "0008,0081";

	public static final String StationName = "0008,1010";
	public static final String StudyDescription = "0008,1030";

	public static final String PatientsName = "0010,0010";
	public static final String PatientsID = "0010,0020";

	public static final String BodyPartExamined = "0018,0015";
	public static final String SliceThickness = "0018,0050";
	public static final String KVP = "0018,0060";
	public static final String SpaceBetweenSlices = "0018,0088";

	public static final String AquisitionNumber = "0020,0012";
	public static final String ImageNumber = "0020,0013";

	/*
	 * The position (three coordinates) of the upper left corner of the image,
	 * relative to the patient's coordinate system.
	 */
	public static final String ImagePosition = "0020,0032";

	/*
	 * Row and column vectors (six coordinates total) describing the orientation
	 * of the image.
	 */
	public static final String ImageOrientation = "0020,0037";

	// Unique identifier for the series that the image belongs to.
	// I.e. Files in different folder belong to different exams.
	public static final String SeriesInstanceUID = "0020,000E";

	// The size of a pixel (in mm).
	public static final String PixelSpacing = "0028,0030";

}
