package edu.stanford.math.primitivelib.autogen.algebraic;



/**
 * This interface defines a (left) $coefficientType-module structure on
 * a generic data type.
 * 
 * @author autogen
 *
 * @param <double> ring of scalars
 * @param <M> the underlying data type
 */
public interface DoubleAbstractModule<M> {
	/**
	 * Compute the sum of two elements.
	 * 
	 * @param a
	 * @param b
	 * @return a + b
	 */
	public abstract M add(M a, M b);
	
	/**
	 * Compute the difference of two elements.
	 * 
	 * @param a
	 * @param b
	 * @return a - b
	 */
	public abstract M subtract(M a, M b);
	
	/**
	 * Compute the scalar product (left action) of a ring element with
	 * a module element.
	 * 
	 * @param r
	 * @param a
	 * @return r * a
	 */
	public abstract M multiply(double r, M a);
	
	/**
	 * Compute the additive inverse of an element.
	 * 
	 * @param a 
	 * @return -a
	 */
	public abstract M negate(M a);
	
	/**
	 * Get the additive identity element.
	 * 
	 * @return the additive identity, 0
	 */
	public abstract M getAdditiveIdentity();
	
		/**
	 * Compute the scalar product (left action) of a ring element with
	 * a module element.
	 * 
	 * @param r
	 * @param a
	 * @return r * a
	 */
	public abstract M multiply(int r, M a);
		
	/**
	 * This function performs the operation a = a + b.
	 * 
	 * @param a the value to accumulate in
	 * @param b the module element to add
	 */
	public abstract void accumulate(M a, M b);
	
	/**
	 * This function performs the operation a = a + r * b.
	 * 
	 * @param a the value to accumulate in
	 * @param b the module element to add
	 * @param c the scalar multiplier
	 */
	public abstract void accumulate(M a, M b, double r);
}