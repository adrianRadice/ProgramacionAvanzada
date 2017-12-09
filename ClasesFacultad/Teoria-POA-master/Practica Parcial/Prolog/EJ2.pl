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

bebida(vino).
bebida(agua_mineral).
bebida(cerveza).

%fin clauses

%A
principal(Plato):- carne(Plato);pescado(Plato).
menus(Entrada,Principal,Postre,Bebida):- entrada(Entrada),principal(Principal),postre(Postre),bebida(Bebida).
%B
menuConsome(Principal,Postre,Bebida):-menus(consome,Principal,Postre,Bebida).
%C
menuSinConsome(Entrada,Principal,Postre,Bebida):-entrada(Entrada),dif(Entrada,consome),principal(Principal),postre(Postre),bebida(Bebida).

