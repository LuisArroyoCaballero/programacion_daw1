Algoritmo Ejercicio5_2
	Escribir "Digame un numero del 1 al 7"
	Leer num
	
	Si num<=0 o num>=8 Entonces
		Escribir "Necesito un numero del 1 al 7"
	SiNo
		Si num=1 Entonces
			Escribir "El dia de la semana es LUNES"
		SiNo
			Si num=2 Entonces
				Escribir "El dia de la semana es MARTES"
			SiNo
				Si num=3 Entonces
					Escribir "El dia de la semana es MIERCOLES"
				SiNo
					Si num=4 Entonces
						Escribir "El dia de la semana es JUEVES"
					SiNo
						Si num=5 Entonces
							Escribir "El dia de la semana es VIERNES"
						SiNo
							Si num=6 Entonces
								Escribir "El dia de la semana es SABADO"
							SiNo
								Escribir "El dia de la semana es DOMINGO"
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
