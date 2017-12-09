%clauses
transporte(roma,20).
transporte(londres,30).
transporte(tunez,10).

alojamiento(roma,hotel,50).
alojamiento(roma,hostal,30).
alojamiento(roma,camping,10).
alojamiento(londres,hotel,60).
alojamiento(londres,hostal,40).
alojamiento(londres,camping,20).
alojamiento(tunez,hotel,40).
alojamiento(tunez,hostal,20).
alojamiento(tunez,camping,5).
%finclauses


multiplicar(X,Y,R):- R is X*Y.
sumar(X,Y,R):- R is X+Y.
menor(X,Y):- X < Y.

viaje(Ciudad,Semana,Hotel,Pesos):-transporte(Ciudad,X),alojamiento(Ciudad,Hotel,Y), Pesos is X+Y*Semana.
viaje2(Ciudad,Semana,Hotel,Pesos):-transporte(Ciudad,PrecioTransporte),alojamiento(Ciudad,Hotel,PrecioPorSemana), multiplicar(PrecioPorSemana,Semana,CostoEstadia),sumar(CostoEstadia,PrecioTransporte,Pesos).
viajeeconomico(C,S,H,P,Pmax):-viaje2(C,S,H,P), menor(P,Pmax).