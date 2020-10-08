Funcion resultado <- esPrimo(num)
	Definir resultado Como Logico
	resultado <- Verdadero
	
	Para i<-2 hasta num-1 Con Paso 1 Hacer
		si num mod i = 0 Entonces
			resultado <- Falso
		FinSi	
	FinPara
	
	
	
FinFuncion
	
Algoritmo Entregable_Ejercicio4
	Escribir "Por favor vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo: "
	max <- 0
	Leer num
	min <- num
	almacen <- 0
	numero_de_primos <- 0
	Mientras no esPrimo(num) hacer
		Si max<num Entonces
			max <- num
		FinSi
		
		Si min>num
			min <- num
		FinSi
		
		almacen <- almacen + num
		
		numero_de_primos <- numero_de_primos + 1
		Leer num
	FinMientras
	media <- (almacen)/(numero_de_primos)
	Escribir "Ha introducido ", numero_de_primos, " no primos"
	Escribir "Maximo: ",max
	Escribir "Mínimo: ",min
	Escribir "Media: ",media
		
FinAlgoritmo	
