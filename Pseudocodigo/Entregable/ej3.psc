Algoritmo Ejercicio_Ejercicio3
	Escribir "Digame la altura de la figura, que sea un numero impar mayor que cinco: "
	Leer altura
	Si altura%2<>0 y altura>=5 Entonces
		
		Para i<- 1 hasta altura con paso 1 Hacer
			Para j <- 1 hasta 6 Con Paso 1 Hacer
				Si i=1 o i=altura o j=1 o j=6 o i=trunc((altura+1)/2) Entonces
					Escribir Sin Saltar "M"
				Sino 
					Escribir Sin Saltar " "
				FinSi			
			FinPara
			Escribir " "
		FinPara
	SiNo
		Escribir "La altura introducida no es correcta."
	FinSi
	
FinAlgoritmo
