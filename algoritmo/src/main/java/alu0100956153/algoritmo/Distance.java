package alu0100956153.algoritmo;

/**
 * 
 * \author Hector
 * \brief clase Distance que calcula la distancia de  Levenshtein entre dos cadenas
 */
public class Distance {
		/**
		 * \brief minimo entre tres números
		 * \param a primer número
		 * \param b segundo número
		 * \param c tercer número
		 * @return numero minimo
		 */
	    static int minimum(int a, int b, int c) {
	         return Math.min(a, Math.min(b, c));
	    }
	    /**
	     * \brief metodo estatico que recibe dos string y devuelve la distancia de levenshtein
	     * \param str1 cadena a
	     * \param str2 cadena b
	     * \return distancia entre las dos cadenas
	     */
	    public static int computeLevenshteinDistance(String str1, String str2) {
	        return computeLevenshteinDistance(str1.toCharArray(),
	                                          str2.toCharArray());
	    }
	    
	    /**
	     * \brief metodo estatico que recibe dos char[] y devuelve la distancia de levenshtein
	     * \param str1 cadena a
	     * \param str2 cadena b
	     * \return distancia entre las dos cadenas
	     */
	    private static int computeLevenshteinDistance(char [] str1, char [] str2) {
	        int [][]distance = new int[str1.length+1][str2.length+1];

	        for(int i=0;i<=str1.length;i++){
	                distance[i][0]=i;
	        }
	        for(int j=0;j<=str2.length;j++){
	                distance[0][j]=j;
	        }
	        for(int i=1;i<=str1.length;i++){
	            for(int j=1;j<=str2.length;j++){ 
	                  distance[i][j]= minimum(distance[i-1][j]+1,
	                                        distance[i][j-1]+1,
	                                        distance[i-1][j-1]+
	                                        ((str1[i-1]==str2[j-1])?0:1));
	            }
	        }
	        return distance[str1.length][str2.length];
	        
	    }
}
