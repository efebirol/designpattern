package singleton;

import lombok.Getter;

@Getter
public class SingletonService {

	// There can only be one! instantiation
	private static SingletonService myOnlyHighlander;

	/*
	 * 1. Make constructor as private.
	 */
	private SingletonService() {
	}

	/*
	 * 2. Write a static method that has return type object of this singleton class.
	 */
	public static SingletonService getInstance() {

		if (myOnlyHighlander == null)
		{
			SingletonService.myOnlyHighlander = new SingletonService(); 
		}
		return myOnlyHighlander;
	}

	public String saySomething() {
		return "Mcleod says: There can only be one!";
	}
}
