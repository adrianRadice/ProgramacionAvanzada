
hombre(pedro).
hombre(manuel).
hombre(arturo).

mujer(maria).

padre(pedro, manuel).
padre(pedro, arturo).
padre(pedro, maria).

%expresa que X es hijo o hija de Y.
ninio(X,Y):-padre(Y,X).

%expresa que X es un hijo varón de Y.
hijo(X,Y):-hombre(X),padre(Y,X).

%expresa que X es una hija de Y.
hija(X,Y):-mujer(X),padre(Y,X).

%expresa que X es hermano o hermana de Y.
hermano_o_hermana(X,Y):-padre(Z,X),padre(Z,Y),dif(X,Y).

%expresa que X es un hermano de Y.
hermano(X,Y):-hombre(X),hermano_o_hermana(X,Y).

%expresa que X es una hermana de Y.
hermana(X,Y):-mujer(X),hermano_o_hermana(X,Y).

%Nota:  Un individuo no puede ser hermano ni  hermana de sí mismo.
