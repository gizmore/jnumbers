package org.jnumbers.gizmore;

/**
 * Fast replacements for String formats.
 * @TODO: Actually come up with an idea.
 * @author gizmore
 */
public final class NumberFormat {

	private static final String[] FMTS = {
			"%d",
			"%,01f",
			"%,02f",
			"%,03f",
			"%,04f",
			"%,05f",
			"%,06f",
			"%,07f",
			"%,08f",
			"%,09f",
	};
	
	public final String toDouble(final double dbl, final int precision) {
		return String.format(FMTS[precision], dbl);
	}
	
}
