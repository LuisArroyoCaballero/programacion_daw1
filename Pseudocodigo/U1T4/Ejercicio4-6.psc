Algoritmo Ejercicio4_6
	Escribir "Digame un numero"
	Leer num1
	Escribir "Digame un segundo numero"
	Leer num2
	Escribir "Digame un tercer numero"
	Leer num3
	Si num1>num2 y num1>num3 Entonces
		Escribir "El primer numero es el mayor de todos"
	SiNo
		Si num2>num3 Entonces
			Escribir "El segundo numero es el mayor de los tres"
		SiNo
			Si Num3>num2 Entonces
				Escribir "El tercer numero es el mayor de todos"
			SiNo
				Escribir "Los tres numeros son iguales"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
