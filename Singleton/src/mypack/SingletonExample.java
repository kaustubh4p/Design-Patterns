package mypack;
import java.io.Serializable;

/**
 * @author Kaustubh Waghmare
 *
 */
public class SingletonExample implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;
	private static SingletonExample singletonExample = null;

// To stop external class for creating object of the singleton class directly, create the constructor as private
	private SingletonExample() {
	}

// 	Lazy Initialization
	public static SingletonExample getInstance() {
		if (singletonExample == null) {
			synchronized (SingletonExample.class) {
				singletonExample = new SingletonExample();
			}
		}
		return singletonExample;
	}

// Eager Initialization of Singleton Instance

/*
  private static SingletonExample singleton = new SingletonExample(); 
  private SingletonExample() { } 
  public static SingletonExample getInstance() 
  {
   	return singleton; 
  }
 */

/*
  private static SingletonExample singleton = null; 
  static{ 
  	singleton = new SingletonExample(); 
  } 
  private SingletonExample() { } 
  public static SingletonExample getInstance() 
  { return singleton; }
 */

// Stop to create Clone in Singleton Design Pattern	

/*	
private static class PughSingleton { 
    public static final SingletonExample singleton = new SingletonExample();
    }
public static SingletonExample getInstance() {
    return PughSingleton.singleton;
    }
private Object readResolve() throws ObjectStreamException {
    return PughSingleton.singleton;
    }
@Override
    public Object clone() throws CloneNotSupportedException {
      throw new CloneNotSupportedException();
    }
*/
	
	public static void main(String args[]) {
		System.out.println(SingletonExample.getInstance());
		System.out.println(SingletonExample.getInstance());
		System.out.println(SingletonExample.getInstance());
		System.out.println(SingletonExample.getInstance());
	}

}
