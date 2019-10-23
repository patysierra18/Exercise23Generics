package com.exercise23generics.model;

public class Suma <T>
{
	T miObjeto;
	
	public Suma(T miObjeto)
	{
		this.miObjeto = miObjeto;
	}
	
	public T getMiObjeto()
	{
		return miObjeto;
	}
	
	public static <T extends Number,T2 extends Number> T SumaNumeros(T objeto1,T2 objeto2)
	{
		Double resultado=0.0;
		resultado = objeto1.doubleValue() + objeto2.doubleValue();
		return (T) resultado;
		
		
	
		
		
	}
	
	
}

