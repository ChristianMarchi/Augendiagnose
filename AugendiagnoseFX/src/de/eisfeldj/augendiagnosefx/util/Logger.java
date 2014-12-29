package de.eisfeldj.augendiagnosefx.util;

/**
 * Utility class for debugging.
 */
public final class Logger {

	/**
	 * The logger to be used.
	 */
	private static final java.util.logging.Logger LOGGER = java.util.logging.Logger
			.getLogger(java.util.logging.Logger.GLOBAL_LOGGER_NAME);

	/**
	 * Hide default constructor.
	 */
	private Logger() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Make an info entry.
	 *
	 * @param output
	 *            the content of the log entry.
	 */
	public static void info(final String output) {
		LOGGER.info(output);
	}

	/**
	 * Make a warning entry.
	 *
	 * @param output
	 *            the content of the log entry.
	 */
	public static void warning(final String output) {
		LOGGER.warning(output);
	}

	/**
	 * Make an error entry.
	 *
	 * @param output
	 *            the content of the log entry.
	 */
	public static void error(final String output) {
		LOGGER.severe(output);
	}

}
