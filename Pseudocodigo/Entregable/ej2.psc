Algoritmo Entregable_Ejercicio2
	Escribir "Introduzca un numero: "
	Leer num
	resultado <- 0
	long <- 0
	cont <- num
	temp <- num
	temp_2 <- 0
	Mientras cont<>0 Hacer
		long <- long+1
		cont <- trunc(cont/10)
	FinMientras
	Para i <- 1 Hasta long Con Paso 1 Hacer
		temp <- (temp/10)-(trunc(num/10))
		temp_2 <- temp_2+(temp*10)
		temp_2 <- temp_2
		Escribir temp
		Escribir temp_2
		Escribir num
		
	Fin Para
	
FinAlgoritmo
