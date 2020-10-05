Algoritmo Ejercicio6_3
	
	num1 <- azar(101)
	num2 <- azar(101)
	Escribir num1," ",num2
	
	Escribir "Introduzca la suma"
	Leer num
	Mientras num <> (num1+num2) Hacer
		Escribir "Incorrecto, vuelva a intentarlo"
		Leer num
		
	FinMientras
	
FinAlgoritmo
