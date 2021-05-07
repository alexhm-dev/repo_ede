package javadoc;

public class JavaDoc {
	/**
	 * @author Alex
	 * @version v1.0
	 * @since 2021/05/07
	 * @param var1 es un número entero
	 * @param var2 es un booleano que no se usa
	 * @return <i>true</i> si es un número par y <i>false</i> si es impar
	 */
	public boolean nombreMetodo(int var1, boolean var2) {
		if(var1%2 == 0) {
			return true;
		}
		return false;
	}
	
	
}
