gauss(1,R,I):-R is I+1,!.
gauss(N,R,I):-N1 is N-1, I1 is I+1, gauss(N1,R1,I1), R is R1+N+I.
gauss(X,R):-gauss(X,R1,1),R is R1/2.

fibo(0,0):-!.
fibo(1,1):-!.
fibo(X,Y):- N is X-1, fibo(N,A1),N2 is X-2, fibo(N2,A2), Y is A2+A1.

factorial(0,1):-!.
factorial(X,Y):-Z is X-1, factorial(Z,N), Y is X*N.

suce(0,_,0):-!.
suce(_,0,0):-!.
suce(X,Y,Z):-G is X-1, suce(G,Y,N), Z is Y+N.

potencia(_,0,1):-!.
potencia(X,1,X):-!.
potencia(X,Y,Z):-G is Y-1, potencia(X,G,N), Z is X*N.



fibo2(-1,0):-!.
fibo2(0,1):-!.
fibo2(1,1):-!.
fibo2(X,Y):- N is X-1, fibo(N,A1),N2 is X-2, fibo(N2,A2), Y is A2+A1.
