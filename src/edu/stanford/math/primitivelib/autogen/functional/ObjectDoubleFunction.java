package edu.stanford.math.primitivelib.autogen.functional;


/**
 * This interface defines a function from type T to type double.
 * 
 * @author autogen
 *
 */
public interface ObjectDoubleFunction<T> {
	/**
	 * This performs the function evaluation on an argument.
	 * 
	 * @param argument the argument of the function
	 * @return the function evaluated at the supplied argument value
	 */
	public double evaluate(T argument);
}