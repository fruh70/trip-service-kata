#Test sur code legacy

Couvrez ce code avec tests autant que possible. Ensuite refactorez le code à votre goût. Idéalement la classe TripService doit être testé unitairement en totalité


##Contraintes 
* ne pas changer le code sans avoir un test pour qui couvre ce bout.
* si on doit changer le code pour écrire des tests, ce faire __uniquement__ 
avec refactorings automatisés.


##Indices
...                               
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
  
* Spy ou sous-classer TripService
* Ajout de variable d'instance
* Ajout de paramètre à la méthode
* Encapsuler méthode statique par méthode d'instance   


Merci à Sandro pour son exemple dans le billet [Testing legacy code: Hard-wired dependencies][1]
[1]: http://craftedsw.blogspot.com/2011/07/testing-legacy-hard-wired-dependencies.html "Testing legacy code: Hard-wired dependencies blog post"

