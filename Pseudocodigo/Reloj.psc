Algoritmo Reloj
	
	Leer altura
	k <- 0	
	Para i <- 0 hasta altura-1 con paso 1 Hacer
		Para j <- 0 hasta (altura-1) Con Paso 1 Hacer
			
			Si (j>= i y j < (altura-i)) o (i > altura/2 y j <= i y j >= (altura - i - 1)) Entonces
				Escribir Sin Saltar "*"
			SiNo
				Escribir Sin Saltar " "
			FinSi				
						
		FinPara
		Escribir " "
	Fin para	
	
FinAlgoritmo
