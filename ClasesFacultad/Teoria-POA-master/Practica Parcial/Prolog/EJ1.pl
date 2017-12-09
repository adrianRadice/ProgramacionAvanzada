%clauses 

entrada(paella).
entrada(gazpacho).
entrada(consome).

carne(filete_de_cerdo).
carne(pollo_asado).

pescado(trucha).
pescado(bacalao).

postre(flan).
postre(helado).
postre(pastel).

%fin clauses

%A
principal(Plato):- carne(Plato);pescado(Plato).
menus(Entrada,Principal,Postre):- entrada(Entrada),principal(Principal),postre(Postre).
%B
menuConsome(X,Z):-menus(consome,X,Z).
%C
menuSinConsome(Entrada,Principal,Postre):-entrada(Entrada),dif(Entrada,consome),principal(Principal),postre(Postre).