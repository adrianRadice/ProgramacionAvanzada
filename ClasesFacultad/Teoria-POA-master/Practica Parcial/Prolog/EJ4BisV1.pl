parcial1(ana,7).
parcial1(juan,4).
parcial1(pepo,2).
parcial1(oscar,2).

parcial2(ana,9).
parcial2(juan,8).
parcial2(oscar,9).
parcial2(pepo,2).

promociona(Alumno,NotaFinal):-parcial1(Alumno,P1),parcial2(Alumno,P2),P1>=7,P2>=7,NotaFinal is (P1+P2)/2.
cursa(Alumno):-parcial1(Alumno,P1),parcial2(Alumno,P2),P1>=4,P2>=4,(P1<7 ; P2<7).
recursa(Alumno):-parcial1(Alumno,P1),parcial2(Alumno,P2),(P1<4 ; P2<4).