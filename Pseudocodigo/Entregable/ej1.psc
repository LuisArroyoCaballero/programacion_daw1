Algoritmo Entregable_Ejercicio_1
	Escribir "Introduzca la cantidad de producto que desee: "
	Leer cant
	
	
	Si cant<=100 Entonces
		coste <- (5.23*cant)
	SiNo
		Si cant>100 y cant<=1000 Entonces
			coste <- (5.23*100)+(4.16*(cant-100))
		SiNo
			Si cant>=1001 Entonces
				coste <- (5.23*100)+(4.16*900)+(5.23/2)*(cant-1000)
			SiNo
				Escribir "Error, introduzca una cantidad valida."
			FinSi
			
		FinSi
	FinSi
	Escribir coste
FinAlgoritmo
