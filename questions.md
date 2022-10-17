# QUESTIONS TP PILE

## Question 1 :
✅ Écrire une classe test pour tester le fonctionnement de votre classe.

## Question 2 :
On souhaite maintenant que la classe Pile puisse contenir non pas des
objets de type String mais des objets de type quelconque.

✅ 1) Quelle est la solution à mettre en œuvre si une pile peut contenir
des objets de type hétérogene ?

**Réponse** => Je peux typer l'ArrayList comme un objet (ArrayList<Object>)

✅ 2) Quelle est la solution a mettre en œuvre si une pile ne peut contenir
que des objets du même type ? Expliquer les modifications qui devraient alors être
apportées au code précédent.

**Réponse** => Je peux définir plusieurs ArrayList en fonction de ce que j'ai besoin
```java
ArrayList<String>
ArrayList<Integer>
...
```


## Question 3 :
On dispose maintenant d’une interface Pile (voir Interface IPile)

✅ 1) Quelle est la différence entre cette interface et les classes discutées dans la question précédente?

**Réponse** => Une interface est une classe abstraite particulière :
- elle n'a pas d'attributs
- toutes les méthodes sont abstraites.

✅ 2) Quels sont les avantages et les inconvénients de la solution offerte par l’interface ?

**Réponse** =>
- Avantage : une classe peut implémenter plusieurs interfaces => héritage multiple
- Inconvénient : une interface ne peut pas être instanciée

✅ 3) Modifier l'interface pour qu'elle soit vraiment générique.

✅ 4) Modifier et tester votre classe Pile pour qu'elle utilise l’interface IPile.

## Question 4 :
✅ 1) Ajouter a la classe Pile composée d’objets String la possibilité d’écrire son contenu dans un fichier texte
   passé en paramètre. On écrira un élément par ligne.

✅ 2) Ajouter a la classe Pile composée d’objets String la possibilité de lire son contenu depuis un fichier texte
   passé en paramètre. On lira un élément par ligne.

## Question 5 :
❌ 1) Pouvoir sauvegarder un objet Pile dans un fichier binaire et pouvoir le relire pour instancier
un nouvel objet de type Pile.

- On pourra utiliser les classes ObjectInputStream pour lire (méthode readObject)
- ObjectOutputStream pour écrire (méthode writeObject) des objets dans un fichier.
- L’objet à lire ou à écrire peut subir une sérialisation, et implémente donc l’interface Serializable.


