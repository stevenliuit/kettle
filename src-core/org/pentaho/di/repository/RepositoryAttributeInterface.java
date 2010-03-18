package org.pentaho.di.repository;


/**
 * This interface allows you to pass a simple interface to an object to allow it 
 * to store or load itself from or to any type of repository in a generic fashion.
 * @author matt
 *
 */
public interface RepositoryAttributeInterface {

	public void setAttribute(String code, String value);
	public String getAttribute(String code);
	public void setAttribute(String code, boolean value);
	public boolean getAttributeBoolean(String code, boolean defaultValue);
	public void setAttribute(String code, long value);
	public long getAttributeInteger(String code, long defaultValue);
}