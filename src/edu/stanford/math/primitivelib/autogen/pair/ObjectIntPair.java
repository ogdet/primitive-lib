package edu.stanford.math.primitivelib.autogen.pair;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;


/**
 * This class implements a pair (a, b), where a is of type T and b 
 * is of type int. Note that any instance of this class is immutable, and
 * implements value semantics.
 * 
 * @author autogen
 *
 */
public class ObjectIntPair<T> {
	/*
	 * Make the fields first and second final to maintain immutability.
	 */
	protected final T first;
	protected final int second;
	
	/**
	 * Constructor which initializes the pair.
	 * 
	 * @param first the value of the first component
	 * @param second the value of the second component
	 */
	public ObjectIntPair(T first, int second) {
		this.first = first;
		this.second = second;
	}
	
	/**
	 * Constructor which initializes from another ObjectIntPair<T>.
	 * 
	 * @param pair the ObjectIntPair<T> to initialize from
	 */
	public ObjectIntPair(ObjectIntPair<T> pair) {
		this.first = pair.first;
		this.second = pair.second;
	}
	
	/**
	 * Get the first component.
	 * 
	 * @return the first component
	 */
	public T getFirst() {
		return this.first;
	}
	
	/**
	 * Get the second component.
	 * 
	 * @return the second component
	 */
	public int getSecond() {
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
		final ObjectIntPair<?> other = (ObjectIntPair<?>) obj;
		return new EqualsBuilder().append(first, other.first).append(second, other.second).isEquals();
	}
}