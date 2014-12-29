package de.eisfeldj.augendiagnosefx.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Utility class for handling dates.
 */
public final class DateUtil {
	/**
	 * The date format to be used for display.
	 *
	 * TODO: use locale default format
	 */
	private static final String DATE_FORMAT_DISPLAY = "d. MMMM yyyy";

	/**
	 * Hide default constructor.
	 */
	private DateUtil() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Transfer a date String into a date object, using a given date format.
	 *
	 * @param date
	 *            the date string
	 * @param format
	 *            the date format
	 * @return the date object
	 * @throws ParseException
	 */
	public static Date parse(final String date, final String format) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat(format, Locale.getDefault());
		return dateFormat.parse(date);
	}

	/**
	 * Format a date object into a date String using a given date format.
	 *
	 * @param date
	 *            the date object
	 * @param format
	 *            the date format
	 * @return the formatted date
	 */
	public static String format(final Date date, final String format) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(format, Locale.getDefault());
		return dateFormat.format(date);
	}

	/**
	 * Get display format of the date.
	 *
	 * @param calendar
	 *            the date as calendar object
	 * @return the date formatted for display
	 */
	public static String getDisplayDate(final Calendar calendar) {
		return format(calendar.getTime(), DATE_FORMAT_DISPLAY);
	}

}
