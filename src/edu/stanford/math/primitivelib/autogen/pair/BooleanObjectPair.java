package edu.stanford.math.primitivelib.autogen.pair;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;


/**
 * This class implements a pair (a, b), where a is of type boolean and b 
 * is of type U. Note that any instance of this class is immutable, and
 * implements value semantics.
 * 
 * @author autogen
 *
 */
public class BooleanObjectPair<U> {
	/*
	 * Make the fields first and second final to maintain immutability.
	 */
	protected final boolean first;
	protected final U second;
	
	/**
	 * Constructor which initializes the pair.
	 * 
	 * @param first the value of the first component
	 * @param second the value of the second component
	 */
	public BooleanObjectPair(boolean first, U second) {
		this.first = first;
		this.second = second;
	}
	
	/**
	 * Constructor which initializes from another BooleanObjectPair<U>.
	 * 
	 * @param pair the BooleanObjectPair<U> to initialize from
	 */
	public BooleanObjectPair(BooleanObjectPair<U> pair) {
		this.first = pair.first;
		this.second = pair.second;
	}
	
	/**
	 * Get the first component.
	 * 
	 * @return the first component
	 */
	public boolean getFirst() {
		return this.first;
	}
	
	/**
	 * Get the second component.
	 * 
	 * @return the second component
	 */
	public U getSecond() {
		return this.second;
	}
	
	@Override
	public String toString() {
		return ("(" + first + ", " + second + ")");
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(first).append(second).toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final BooleanObjectPair<?> other = (BooleanObjectPair<?>) obj;
		return new EqualsBuilder().append(first, other.first).append(second, other.second).isEquals();
	}
}