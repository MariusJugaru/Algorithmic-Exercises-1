## - Tehnici de Programare (s,i Gigel) -

```
Responsabili:
Andrei Preda, Cristian P ̆atras,cu, Ioan Pop,
```

               - PA - Tema
            - Deadline soft: 18 04 .2024 23: Ioana Dabelea, Ioan Popescu, Alexandru Dima, Cristian Tudorache
         - Deadline hard: 25 04 .2024 23:
- 1 Problema 1 : Alimentare Servere cuprins
   - 1 1 Enunt,
   - 1 2 Date de intrare
   - 1 3 Date de ies,ire
      - 1 3 1 Afis,are
   - 1 4 Restrict,ii s,i preciz ̆ari
   - 1 5 Testare s,i punctare
   - 1 6 Exemple
- 2 Problema 2 : Colorare
   - 2 1 Enunt,
   - 2 2 Date de intrare
   - 2 3 Date de ies,ire
   - 2 4 Restrict,ii s,i preciz ̆ari
   - 2 5 Testare s,i punctare
   - 2 6 Exemple
- 3 Problema 3 : Compresie
   - 3 1 Enunt,
   - 3 2 Date de intrare
   - 3 3 Date de ies,ire
   - 3 4 Restrict,ii s,i preciz ̆ari
   - 3 5 Testare s,i punctare
   - 3 6 Exemple
- 4 Problema 4 : Criptat
                  -
      - CUPRINS
   - 4 1 Enunt,
   - 4 2 Date de intrare
   - 4 3 Date de ies,ire
   - 4 4 Restrict,ii s,i preciz ̆ari
   - 4 5 Testare s,i punctare
   - 4 6 Exemple
- 5 Problema 5 : Oferta
   - 5 1 Enunt,
   - 5 2 Date de intrare
   - 5 3 Date de ies,ire
   - 5 4 Restrict,ii s,i preciz ̆ari
   - 5 5 Testare s,i punctare
   - 5 6 Exemple
- 6 Punctare
   - 6 1 Checker
- 7 Folosire ChatGPT
- 8 Format arhiv ̆a
- 9 Links


```
problema 1: alimentare servere 3
```
## 1 Problema 1 : Alimentare Servere cuprins

### 1 1 Enunt,

Avem la dispozit,ie un grup deNservere, fiecare cu o putere de calcul proprie
Pi. Serverele funct,ioneaz ̆a optim când sunt alimentate cu o cantitate de curentCi.
Dac ̆a un server este subalimentat sau supraalimentat, puterea sa de calcul scade cu o
unitate pentru fiecare unitate de curentmismatched(puterea final ̆a poate s ̆a fie **inclusiv
negativ ̆a** ).
Suntem nevoit,i s ̆a aliment ̆am toate serverele cu aceeas,i cantitate de curent, dar,
din fericire, control ̆am aceast ̆a cantitate. Care este puterea de calcul maxim ̆a a
sistemului, s,tiind c ̆a clusterul va fi **limitat de cea mai mic ̆a putere individual ̆a**?

### 1 2 Date de intrare

Pe prima linie din fis,ierul **servere.in** va fi num ̆arul de servere,N.
Pe a doua linie vor fiNnumere naturale reprezentând puterile de calcul ale
serverelor (vectorulP).
Pe a treia linie vor fiNnumere naturale reprezentând limitele de alimentare ale
serverelor (vectorulC).

### 1 3 Date de ies,ire

În fis,ierul **servere.out** vet,i scrie puterea de calcul maxim ̆a care poate fi atins ̆a,
cea mai mic ̆a dintre puterile individuale. Afis,at,i puterea cu **exact o zecimal ̆a**.

#### 1 3 1 Afis,are

În C++ putet,i folosi biblioteca <iomanip>, s,i funct,iile fixed s,i setprecision
pentru a afis,a un num ̆ar cu o zecimal ̆a, astfel:

```
#include <iomanip>
```
```
// În interiorul unei funct,ii
fout << fixed << setprecision( 1 ) << rezultat << " \n ";
```
```
În Java putet,i folosi metodaString.format, astfel:
```
```
fout.println(String.format("%.1f", rezultat));
```

```
problema 1: alimentare servere 4
```
```
1.4 Restrict,ii s,i precizări
```
- 1 ⩽N⩽ 105 , num ̆arul de servere
- 1 ⩽Pi⩽ 109 , puterile de calcul
- 1 ⩽Ci⩽ 109 , pragurile de alimentare optime
- Toate numerele din datele de intrare sunt întregi.
- Puterea de alimentare aleas ̆a de voi **poate s ̆a nu fie num ̆ar întreg**.

### 1 5 Testare s,i punctare

- Punctajul maxim este de 25 puncte.
- Timpul de execut,ie:
    **-** C/C++: 1 **s**
    **-** Java: 2 **s**
- Sursa care cont,ine funct,ia **main** trebuie obligatoriu denumit ̆a:
    **servere.c** , **servere.cpp** sau **Servere.java**.

### 1 6 Exemple

servere.in servere.out Explicat,ie
4
6 9 7 5
2 4 1 8

```
2.5 Sunt 4 servere, având puterile 6 , 9 , 7 s,i 5.
Pragurile lor de alimentare sunt 2 , 4 , 1 , s,i 8.
Alimentând cu 5. 5 unit ̆at,i vom obt,ine puterile
individuale:
```
- 6 −| 5. 5 − 2 |= 2. 5
- 9 −| 5. 5 − 4 |= 7. 5
- 7 −| 5. 5 − 1 |= 2. 5
- 5 −| 5. 5 − 8 |= 2. 5
Puterea sistemului va fi cea mai mic ̆a dintre ele,
adic ̆a 2. 5. Nu putem obt,ine o putere mai mare
de atât dac ̆a aliment ̆am la alt prag (nici mai
mare, nici mai mic).


```
problema 2: colorare 5
```
## 2 Problema 2 : Colorare

### 2 1 Enunt,

Gigel a început s ̆a fie din ce în ce mai pasionat de pictur ̆a. Problema este, îns ̆a,
c ̆a nu prea are talent, as,a c ̆a a decis s ̆a îs,i cumpere picturi pe numere. Uitându-se pe
AlgoExpress, a g ̆asit o ofert ̆a de nerefuzat pentru un tablou s,i a început s ̆a citeasc ̆a
mai multe despre el.
Tabloul are o lungime deNcentimetri s,i o l ̆at,ime de 2 centimetri, fiecare p ̆atr ̆at,el
care trebuie colorat având o suprafat, ̆a de 1 cm^2. Regulile de colorare sunt urm ̆atoarele:

- nu pot,i folosi decât 3 **culori** (galben, roz s,i mov)
- nu pot,i colora p ̆atr ̆at,ele individuale, ci doar dreptunghiuri de dimensiune 1 × 2 ,
    as,ezate fie pe orizontal ̆a, fie pe vertical ̆a (întreg dreptunghiul trebuie colorat cu
    aceeas,i culoare)
- dou ̆a dreptunghiuri care au o **latur ̆a comun ̆a** trebuie s ̆a fie **colorate diferit**.

Fascinat de acest tablou, Gigel a început s ̆a se gândeasc ̆a în câte moduri diferite
ar putea ar ̆ata la final tabloul. Ajutat,i-l pe Gigel sa afle **num ̆arul de modele distincte** ,
modulo 109 + 7.

### 2 2 Date de intrare

Pe prima linie din fis,ierul **colorare.in** va fi un num ̆ar natural,K.
Pe a doua linie vor fiKperechi de forma “X T”, cu semnificat,ia: “urm ̆atoareleX
zone din tablou sunt de tipulT(verticale sau orizontale)”.

### 2 3 Date de ies,ire

În fis,ierul **colorare.out** vet,i scrie num ̆arul de tablouri distincte care se pot
realiza, modulo 109 + 7.

**2.4 Restrict,ii s,i precizări**

- 1 ⩽N⩽ 2 ∗ 107 , pentru 15 puncte.
- 2 ∗ 107 ⩽N⩽ 1010 , pentru alte 10 **puncte bonus**.
- 1 ⩽K⩽ 105 , num ̆arul de grupuri din input
- 1 ⩽X⩽N, num ̆ar de zone consecutive cu aceeas,i orientare. **Atent,ie** : o singur ̆a
    “zon ̆a orizontal ̆a” e format ̆a din dou ̆a dreptunghiuri orizontale, as,ezate unul
       peste altul.
- Tva fi caracterul “H” pentru zone orizontale, sau “V” pentru zone verticale.


```
problema 2: colorare 6
```
### 2 5 Testare s,i punctare

- Punctajul maxim este de 25 puncte.
- Timpul de execut,ie:
    **-** C/C++: 1 **s**
    **-** Java: 2 **s**
- Sursa care cont,ine funct,ia **main** trebuie obligatoriu denumit ̆a:
    **colorare.c** , **colorare.cpp** sau **Colorare.java**.

<img src="./dcwjp3jw.png" style="width:2.6462in;height:3.0473in" />

### 2 6 Exemple

colorare.in colorare.out Explicat,ie
2
1 H 1 V

```
6
Toate picturile realizabile sunt desenate mai jos.
```

```
problema 3: compresie 7
```
## 3 Problema 3 : Compresie

### 3 1 Enunt,

Fie urm ̆atoarea operat,ie asupra unui s,ir de numere: se alege o subsecvent, ̆a din
s,ir s,i se înlocuies,te cu suma elementelor din subsecvent, ̆a. De exemplu dac ̆a avem
s,irul[1, 6, 2, 4, 5]s,i alegem subsecvent,a[6, 2, 4], obt,inem[1, 12, 5].
Pentru un s,irAde lungimens,i un s,irBde lungimem, determinat,i dac ̆a putem
obt,ine dou ̆a **s,iruri egale** prin 0 sau mai multe aplic ̆ari ale operat,iei definite mai sus,
asupra luiAsauB, s,i aflat,i care e **lungimea maxim ̆a** pe care o poate avea s,irul obt,inut.

### 3 2 Date de intrare

```
Pe prima linie din fis,ierul compresie.in va fi un num ̆ar natural,n.
Pe a doua linie vor finnumere naturale, reprezentând s,irulA.
Pe a treia linie va fi un num ̆ar natural,m.
Pe a patra linie vor fimnumere naturale, reprezentând s,irulB.
```
### 3 3 Date de ies,ire

În fis,ierul **compresie.out** vet,i scrie un singur num ̆ar întreg, lungimea maxim ̆a a
s,irului rezultat, sau “− 1 ”, în cazul în care nu putem obt,ine dou ̆a s,iruri egale.

**3.4 Restrict,ii s,i precizări**

- 1 ⩽N,M⩽ 3 ∗ 105
- 1 ⩽Ai,Bi⩽ 109

### 3 5 Testare s,i punctare

- Punctajul maxim este de 25 puncte.
- Timpul de execut,ie:
    **-** C/C++: 1 **s**
    **-** Java: 2 **s**
- Sursa care cont,ine funct,ia **main** trebuie obligatoriu denumit ̆a:
    **compresie.c** , **compresie.cpp** sau **Compresie.java**.


```
problema 3: compresie 8
```
### 3 6 Exemple

compresie.in compresie.out Explicat,ie
6
11 2 2 1 8 6
7
3 8 2 1 2 11 3

```
4 Putem aplica urm ̆atoarele operat,ii pe s,irulA:
```
- din[11,2,2,1,8,6]compres ̆am[2,1]
- din[11,2,3,8,6]compres ̆am[8,6]
- obt,inem[11,2,3,14]
Modific ̆am s,irulBastfel:
- din[3,8,2,1,2,11,3]compres ̆am[3,8]
- din[11,2,1,2,11,3]compres ̆am[1,2]
- din[11,2,3,11,3]compres ̆am[11,3]
- obt,inem[11,2,3,14]
Ambele s,iruri sunt acum egale cu[11,2,3,14],
care are 4 elemente.


```
problema 4: criptat 9
```
## 4 Problema 4 : Criptat

### 4 1 Enunt,

Ne dorim s ̆a construim un generator de parole puternice. Din acest motiv, vom
încerca s ̆a construim parole cât mai lungi, pentru a fi mai greu de spart. Dar, pentru a
ne diferent,ia generatorul de celelalte din piat, ̆a, mai avem câteva criterii pe care vrem
s ̆a le îndeplinim.
Avem la dispozit,ie o list ̆a deNcuvinte care ne plac, s,i vrem s ̆a form ̆am parola
doar concatenând unele dintre aceste cuvinte (fiecare cuvânt poate fi folosit cel mult o
dat ̆a). În plus, vrem ca toate parolele pe care le producem s ̆a aib ̆a o liter ̆a dominant ̆a
(o liter ̆a care are strict mai multe aparit,ii decât jum ̆atate din lungimea parolei).
În aceste condit,ii, care este lungimea maxim ̆a a parolei pe care o putem construi?

### 4 2 Date de intrare

```
Pe prima linie din fis,ierul criptat.in va fi num ̆arul de cuvinte care ne plac,N.
Pe urm ̆atoareleNlinii se va afla câte un cuvânt.
```
### 4 3 Date de ies,ire

```
În fis,ierul criptat.out vet,i scrie un singur num ̆ar, lungimea maxim ̆a a parolei.
```
**4.4 Restrict,ii s,i precizări**

- 1 ⩽N⩽ 103 , num ̆arul de cuvinte
- 1 ⩽L⩽ 104 , suma lungimilor cuvintelor din list ̆a
- Cuvintele sunt formate doar din litere mici ale alfabetului englez.
- Num ̆arul de **litere distincte** folosite într-un test va fi **cel mult egal cu** 8.
- Pentru testele acestei probleme vom putea mereu s ̆a form ̆am cel put,in o parol ̆a.

### 4 5 Testare s,i punctare

- Punctajul maxim este de 30 puncte.
- Timpul de execut,ie:
    **-** C/C++: 2 **s**
    **-** Java: 3 **s**
- Sursa care cont,ine funct,ia **main** trebuie obligatoriu denumit ̆a:
    **criptat.c** , **criptat.cpp** sau **Criptat.java**.


```
problema 4: criptat 10
```
### 4 6 Exemple

criptat.in criptat.out Explicat,ie
4
too
otter
tote
oo

```
9 Concatenând primul, al treilea, s,i al patrulea
cuvinte putem obt,ine parola “toototeoo”.
Aceast ̆a parol ̆a are 9 litere s,i cont,ine litera “o”
de 5 ori. Litera “o” este dominant ̆a pentru c ̆a
5 > 9/2.
```
4
abbc
cbb
aa
ab

```
9 Alegem cuvintele “cbb”, “abbc”, s,i “ab”, s,i
form ̆am parola “cbbabbcab”. Lungimea parolei
este 9 , s,i cont,ine litera “b” de 5 ori.
```

```
problema 5: oferta 11
```
## 5 Problema 5 : Oferta

### 5 1 Enunt,

Suntet,i organizator pentru prima edit,ie a hackathonului de algoritmic ̆a. Întrucât
vret,i ca toat ̆a lumea s ̆a aib ̆a o experient, ̆a cât mai frumoas ̆a, v-at,i propus s ̆a cumparat,i
consumabile (snacks, ap ̆a, sucuri etc.) de la un supermarket. Dup ̆a ce at,i ajuns la
cas ̆a s,i at,i asezat celeNprodusele pe banda rulant ̆a, casierul v-a îns,tiint,at c ̆a ast ̆azi
magazinul are dou ̆a oferte atractive:

```
1. Dac ̆a grupat,i dou ̆a produse, vet,i beneficia de o reducere de 50 % pentru
produsul mai ieftin.
2. Dac ̆a grupat,i trei produse, vet,i beneficia de o reducere de 100 % pentru produsul
cel mai ieftin (va fi gratis).
```
Întrucât deja at,i pus toate produsele pe band ̆a, din lips ̆a de timp putet,i s ̆a **grupat,i
doar produsele adiacente**. În schimb, nu suntet,i obligat,i s ̆a grupat,i toate produsele,
pe unele le putet,i cump ̆ara individual (dar trebuie s ̆a le cump ̆arat,i pe toate).

- Care este pret,ul **minim** pe care îl putet,i obt,ine prin gruparea produselor de pe
    band ̆a? ( 20 p)
- (bonus)Care este **al** K **-lea cel mai mic pret, unic** pe care îl putet,i obt,ine prin
    gruparea produselor de pe band ̆a? ( 15 p)

### 5 2 Date de intrare

Pe prima linie din fis,ierul **oferta.in** vor fi num ̆arulNde produse de pe band ̆a,
s,i num ̆arulK. Pentru prima cerint, ̆a vom aveaK= 1.
Pe a doua linie vor fi pret,urile celorNproduse, în ordinea în care apar pe band ̆a.

### 5 3 Date de ies,ire

În fis,ierul **oferta.out** vet,i scrie un singur num ̆ar, pret,ul cerut. Vet,i afis,a pret,ul
cu **exact o zecimal ̆a**. Putet,i g ̆asi indicat,ii pentru afis,area cu o zecimal ̆a la problema
**Servere** (Sect,iunea 1. 3. 1 ).


```
problema 5: oferta 12
```
```
5.4 Restrict,ii s,i precizări
```
```
Pentru 20 de puncte:
```
- 1 ⩽N⩽ 104 , num ̆arul de produse
- K= 1 , deci trebuie s ̆a g ̆asim cel mai mic pret,posibil
- Suma tuturor pret,urilor nu va dep ̆as,i 231 − 1.

```
Pentru alte 15 puncte:
```
- 1 < K⩽ 104
- În cazul în care nu exist ̆a solut,ie vet,i afis,a “− 1 ”.

### 5 5 Testare s,i punctare

- Punctajul maxim este de 35 puncte.
- Timpul de execut,ie:
    **-** C/C++: 3**.** 5 **s**
    **-** Java: 4 **s**
- Sursa care cont,ine funct,ia **main** trebuie obligatoriu denumit ̆a:
    **oferta.c** , **oferta.cpp** sau **Oferta.java**.

### 5 6 Exemple

oferta.in oferta.out Explicat,ie
5 1
80 27 10 20 300

```
413.5 În acest exempluK= 1 , deci ne dorim s ̆a afl ̆am
cel mai mic pret,pe care îl putem obt,ine. Alegem
s ̆a cump ̆ar ̆am primele dou ̆a produse împreun ̆a,
cu costul( 80 +27/2), s,i ultimele trei împreun ̆a,
cu costul( 20 + 300 ), obt,inând un total de 413. 5.
```
5 3
80 27 10 20 300

```
418.5 De aceast ̆a dat ̆a ne dorim s ̆a afl ̆am alK= 3 -lea
cel mai mic pret,unic pe care l-am putea obt,ine.
Cele mai mici 5 pret,uri (de exemplu) pe care
le putem obt,ine sunt 413. 5 , 417. 0 , 418. 5 , 422. 0 ,
423. 5. As,adar, r ̆aspunsul este 418. 5.
```

```
punctare 13
```
## 6 Punctare

- Punctajul temei este de 150 puncte, distribuit astfel:
    - Problema 1 : 25 **p**
    - Problema 2 : 25 **p** (dintre care 10 **p** sunt bonus)
    - Problema 3 : 25 **p**
    - Problema 4 : 30 **p**
    - Problema 5 : 35 **p** (dintre care 15 **p** sunt bonus)
    - 5 puncte vor fi acordate pentru comentarii s,i README.
    - 5 puncte vor fi acordate automat de checker pentru coding style. Totus,i, la
       corectarea manuala se pot aplica **depunct ̆ari de pân ̆a la** 20 **de puncte** pentru
       **coding style neadecvat**.
Punctajul pe README, comentarii s,i coding style este condit,ionat de obt,inerea
unui punctaj strict pozitiv pe cel put,in un test.
    Se poate obt,ine un bonus de 25 **p** rezolvând testele bonus din cadru problemelor
**Colorare** s,i **Oferta** , care reprezint ̆a variante mai dificile ale problemelor init,iale.
Acordarea bonusului **NU** este condit,ionat ̆a de rezolvarea celorlalte teste/probleme.
În total se pot obt,ine 150 de puncte ( **NU** se trunchiaz ̆a).
    Pentru detalii putet,i s ̆a v ̆a uitat,i s,i pesteregulile generalede trimitere a temelor.
- O tem ̆a care **NU** compileaz ̆a va fi punctat ̆a cu 0.
- O tem ̆a care **NU** trece niciun test pe vmchecker va fi punctat ̆a cu 0.
- Vor exista mai multe teste pentru fiecare problem ̆a în parte. Punctele pe teste
sunt independente, punctajul pe un anumit test nefiind condit,ionat de alte teste.
- Fiecare problem ̆a va avea o limit ̆a de timp pe test (precizat ̆a pe pagina cu
enunt,ul). Dac ̆a execut,ia programului pe un test al acelei probleme va dura mai mult
decât limita de timp, vet,i primi automat 0 puncte pe testul respectiv s,i execut,ia va fi
întrerupt ̆a.
- În fis,ierulREADME.md va trebui **s ̆a descriet,i solut,ia** pe care at,i ales-o pentru
fiecare problem ̆a, **s ̆a precizat,i complexitatea** pentru fiecare s,i alte lucruri pe care le
considerat,i utile de ment,ionat.

### 6 1 Checker

- Arhiva se va trimite peVMchecker, unde tema se va testa folosind un set de
teste private.
- Pentru testarea local ̆a, avet,i disponibil un set de teste publice (de aceeas,i
dificultate) pe pagina curesursea temei.
- Arhiva pe care o primit,i (cu scheletul temei) cont,ine fis,ierulREADME.checker.md,
referitor la funct,ionarea checker-ului. V ̆a recomand ̆am s ̆a îl citit,i. Checkerul este strict
cu lucruri precum numele surselor voastre, numele regulilor dinMakefileetc.
- **Punctajul pe teste** este cel de pe VMchecker s,i se acord ̆a rulând tema doar cu
testele private.


```
folosire chatgpt 14
```
- Checkerul verific ̆a doar existent,a unui README cu denumire corect ̆a
(README.md) s,i cont,inut nenul. **Punctajul final pe README s,i comentarii** se acord ̆a
la corectarea manual ̆a a temei.
- La corectarea manual ̆a se poate depuncta pentru **erori de coding style** care nu
sunt semnalate de checker.
- Corectorii îs,i rezerv ̆a dreptul de a sc ̆adea puncte pentru orice problem ̆a g ̆asit ̆a
în implementare, dac ̆a vor considera acest lucru necesar.
- Pentru citirea în Java se recomand ̆a folosireaBufferedReader.

## 7 Folosire ChatGPT

- Folosirea ChatGPT, Copilot sau a oric ̆arui model de limbaj sau tool (denumit in
continuare **LLM** ) ce v ̆a poate ajuta la rezolvarea temei, cu idei sau cod, este puternic
descurajat ̆a, dar nu interzis ̆a.
- În cazul in care folosit,i LLM-uri, trebuie s ̆a specificat,i acest lucru în README,
precum s,i modul în care acestea au fost folosite (ex: ce prompt-uri at,i folosit), pentru
fiecare problem ̆a pentru care au fost folosite tool-uri.
- Pentru fiecare problem ̆a rezolvat ̆a folosind un LLM, pentru care a fost
specificat în README acest lucru, se va aplica o penalizare de **33 %** din punctajul
acelei probleme.
- În cazul în care o problem ̆a este rezolvat ̆a folosind un LLM, dar nu este
specificat acest lucru in README, acest lucru se va considera **încercare de copiere** s,i
se va sanct,iona conformregulamentului.

## 8 Format arhiv ̆a

- Temele pot fi testate automat pe VMchecker. Acesta suport ̆a temele rezolvate
în C/C++ s,i Java.
- Arhiva cu rezolvarea temei trebuie s ̆a fie **.zip** , având un nume de forma
**Grupa_NumePrenume_Tema 1 .zip** (ex: 399 CX_PuiuGigel_Tema 1 .zip) s,i va cont,ine:
    - Fis,ierul/fis,ierele surs ̆a
    - Fis,ierul **Makefile**
    - Fis,ierul **README.md**
- **ATENT,IE!** Tema va fi compilat ̆a s,i testat ̆a **DOAR pe Linux**.
- **ATENT,IE!** Pentru cei ce folosesc C/C++ **NU** este permis ̆a compilarea cu opt,iuni
de optimizare a codului (-O1,-O2, etc.).
- **ATENT,IE!** Orice nerespectare a restrict,iilor duce la pierderea punctajului (dup ̆a
regulile de mai sus).


```
links 15
```
## 9 Links

- Regulament general PA
- Google C++ Style Guide
- Google Java Style Guide
- Debugging s,i Structuri de Date
- Coding Tips pentru teme la PA (OCW)


