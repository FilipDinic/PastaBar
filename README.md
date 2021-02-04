# PastaBar
Napisati mini program za potrebe 2x2 pasta bara. Glavni zadatak ovog programa jeste da se korisniku omoguci da sam naruci pastu po želji. Program ima evidenciju koji sve sastojci postoje kao i cena za svaki, na osnovu cega se kasnije formira ukupna cena paste.Korisnik unosi nazive sastojaka sve dok se ne unese tekst “Poruči”, a zatim se korisniku prikazuje cena željene paste. Za stalne mušterije postoji popust od 10 posto pri placanju. Stalna mušterija se utvrđuje na osnovu broja telefona.

Sastojci i cene:
Makarone - 50 rsd
Spagete - 60 rsd
Bolognese – 120 rsd
Curetina – 120 rsd
Govedja prsuta – 140 rsd
Slanina – 100 rsd
Piletina – 100 rsd
4 sira – 100 rsd
Dimljeni sir – 80 rsd
Parmezan – 50 rsd
Pavlaka – 80 rsd
Pesto sos – 80 rsd
Napolitana – 80 rsd
Povrce mix – 50 rsd
Pecurke – 50 rsd
Kutija – 20 rsd

Brojevi telefona stalnih mušterija:
0631111111
063222222
063333333
064444444
065555555
066666666

Primer izvrsenja 1:
Izvolite !!
Izaberite sastojak za pastu: Makarone
Izaberite sastojak za pastu: Ćuretina
Izaberite sastojak za pastu: 4 sira
Izaberite sastojak za pastu: Pečurke
Izaberite sastojak za pastu: Poruči
Unesite vas broj telefona: 0631111111
Vasa pasta iznosi  288 rsd.    (objasnjenje: Ovaj korisnik ima popust od 10 posto)
Prijatno!!

Primer izvrsenja 2:
Izvolite !!
Izaberite sastojak za pastu: Makarone
Izaberite sastojak za pastu: Ćuretina
Izaberite sastojak za pastu: 4 sira
Izaberite sastojak za pastu: Pečurke
Izaberite sastojak za pastu: Poruči
Unesite vas broj telefona: 063999999
Vasa pasta iznosi 320 rsd.   (objasnjenje: Ovaj korisnik nema popust)
Prijatno!!

Implementacija

Potrebno je definisati tri staticka niza (kao na slici), jedan niz brojeva stalnih mušterija, drugi niz sastojaka a treći niz cena tako da se indeks sastojka i cene poklapaju. 
Npr: indeks = 0, Sastojci[0] = Makarone, cena[0] = cena makarona.

Potrebno je implementirati funkciju za traženje odrađenog sastojka u niz.  Funkcija kao parametre prima niz sastojaka i naziv traženog sastojka a vraća indeks na kom se taj sastojak nalazi. 

Napomena: Za stringove provera jednakosti se vrši preko equals metode. Koristan link
Primer poziva:
ako se za naziv sastojka prosledi “Spagete” funkcija vraca 1
ako se za naziv sastojka prosledi “Curetina” funkcija vraca 3

Potrebno je implementirati funkciju za proveru da li je korisnik stalna mušterija. Funkcija kao parametre prima niz brojeva telefona stalnih mušterija i broj telefona trenutne mušterije a vraća true ili false u zavisnosti da li trazeni broj postoji u nizu brojeva telefona.
