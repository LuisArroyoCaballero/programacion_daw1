Algoritmo Longitud_numero
	Definir num Como Entero;
	Definir pos Como Entero;
	Definir dig Como Entero;
	Definir resultado Como Entero;
	
	Escribir "Por favor, introduzca un numero enero positivo: ";
	Leer num;
	Escribir "Introduzca la posicion dentro del numero: ";
	Leer pos;
	Escribir "Introduzca el nuevo digito: ";
	Leer dig;
	num_temp<-num
	long<-0
	Mientras num_temp<>0 hacer
		num_temp<-num_temp/10
		num_temp<-trunc(num_temp)
		long<-long+1
	FinMientras
	
	inver<-long-pos
	almacen<-inver-trunc(inver)
	
	Escribir almacen
	
	//Para i<-1 Con Paso 1 hasta pos Hacer
	//	long<-num/10
	//FinPara
	
	
	Escribir long
	Escribir num_temp
	Escribir pos
FinAlgoritmo
