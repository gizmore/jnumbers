package org.jnumbers.gizmore;

public final class StringUtil {
	
	/**
	 * Do not create a new String, when no change is made.
	 * @author gizmore
	 * @param s
	 * @param o
	 * @param n
	 * @return of a String
	 */
	public static String fastReplace(final String s, final char o, final char n) {
		return s.indexOf(o) >= 0 ?
				s.replace(o, n) :
				s; // snake jazz
	}

}
