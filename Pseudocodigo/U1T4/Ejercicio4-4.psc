Algoritmo Ejercicio4_4
	Escribir "Digame un numero"
	Leer num1
	Escribir "Digame un segundo numero"
	Leer num2
	
	Si num1>0 y num2>0 Entonces
		Escribir "Los dos numeros son positivos"
	SiNo
		Si num1<=0 y num2<=0 Entonces
			Escribir "Los dos numeros son negativos o 0"
		SiNo
			Escribir "Uno de los numeros es positivo"
		FinSi
	FinSi
	
FinAlgoritmo
