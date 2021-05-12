package javadoc;

public class JavaDoc {
	/**
	 * @author Alex
	 * @version v1.0
	 * @since 2021/05/07
	 * @param var1 es un número entero
	 * @param var2 es un booleano que recoge si var1 es o no par
	 * @return <i>true</i> si es un número par y <i>false</i> si es impar
	 */
	public boolean nombreMetodo(int var1, boolean var2) {
		var2 = false;
		if(var1%2 == 0) {
			var2 = true;
		}
		return var2;
	}
	/**
	 * @author Alex
	 * @version v1.0
	 * @since 2021/05/12
	 * @param num es un número entero
	 * @return <i>true</i> si es un número impar y <i>fasle</i> si es par.
	 */
	public boolean esImpar(int num) {
		return num % 2 == 1;
	}
}
