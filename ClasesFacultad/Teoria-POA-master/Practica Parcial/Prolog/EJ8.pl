sup(a,50).
sup(b,5).
sup(c,50).
sup(d,80).

cross(X,Y):-sup(_,X),sup(_,Y).
selectMay(X,Y):-cross(X,Y),X<Y.
proyMay(X):-selectMay(X,_).
mayor(X):-sup(_,X),not(proyMay(X)),!.
seleccionPaisMay(X):-sup(X,Y),mayor(Z),Z==Y.


selectMin(X,Y):-cross(X,Y),X>Y.
proyMin(X):-selectMin(X,_).
min(X):-sup(_,X),not(proyMin(X)),!.
seleccionPaisMin(X):-sup(X,Y),min(Z),Y==Z.