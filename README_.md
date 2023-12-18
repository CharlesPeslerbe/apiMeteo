# Étape 5
## Dépendances

* Spring Web  
* * Spring Web MVC est le module Spring consacré au développement
    d’application Web et d’API Web.
    Pour une application Web, une interaction avec un serveur correspond à
    l’envoi d’une requête HTTP. Donc les requêtes doivent être prises en
    charge par des contrôleurs. Ce sont eux qui alimentent le modèle avec les
    objets qui seront nécessaires aux vues.

* JPA->
* * JPA, ou Java Persistence API, est une spécification Java qui définit un
    ensemble de normes pour la gestion de la persistance des données dans
    des applications Java. JPA fournit un moyen standardisé de gérer les
    interactions entre les objets Java (entités) et une base de données
    relationnelle, ce qui permet de simplifier considérablement le
    développement d'applications qui nécessitent un accès à la base de
    données.

* Hibernate ->
* * Hibernate est une solution open source de type ORM (Object Relational
    Mapping) qui permet de faciliter le développement de la couche
    persistance d'une application


* H2 ->
* * H2 est un système de gestion de base de données relationnelle (SGBDR)
  open source écrit en Java. Il est conçu pour être léger, rapide, et offre des
  fonctionnalités complètes d'une base de données SQL.

* DevTools ->

* Thymeleaf ->
*  * Thymeleaf est le moteur de génération de vue
     recommandé par le Spring Framework.
* * Avantages :
* * Syntaxe lisible
* * Intégration Spring
* * Templates Valides
* * Internationalisation
* * Facilité de testabilité

# Étape 13
### Avec quelle partie du code avons-nous paramétré l'url d'appel /greeting ?
```java
@GetMapping("/greeting")
```

### Avec quelle partie du code avons-nous choisi le fichier HTML à afficher ?
```java
return "greeting";
```
C'est à dire la valeur de retour de la méthode ```greeting()```
### Comment envoyons-nous le nom à qui nous disons bonjour avec le second lien ?

```java
model.addAttribute("nomTemplate", nameGET);
```

# Étape 17

# Étape 18

# Étape 20
SELECT * FROM ADDRESS

|ID              |CONTENT                             |CREATION                     |
|----------------|------------------------------------|-----------------------------|
|1               |57 boulevard demorieux              |2023-11-20 11:24:51.476033   |
|2               |51 allee du gamay, 34080 montpellier|2023-11-20 11:24:51.479499   |
(2 rows, 0 ms)

# Étape 22

```java
@Autowired
```
Elle sert à l'injection automatique des dépendances.
Elle peut être utilisée pour injecter des dépendances via des constructeurs, des setters ou des champs.

# Étape 30

<ol> 
    <li> Ajouter la dépendance Boostrap dans le fichier pom.xml</li>
    <li> Inclure dans le fragment de la navbar le lien </li>
    
    <link th:rel="stylesheet" th:href="@{/webjars/bootstrap/4.0.0-2/css/bootstrap.min.css} "/>

</ol>

# TP4 

# Étape 6

<ol>
    <li>Oui il faut un token, que l'on obtient en se créant un compte, 500utilisations/jours pour un compte gratuit </li>
    <li> "https://api.meteo-concept.com/api/forecast/daily</li>
    <li>GET</li>
    <li>String urlApiMeteo = "https://api.meteo-concept.com/api/forecast/daily?latlng="+latitude + "%2C" + longitude+"&insee="+citycode+token;</li>
    <li>tmin et tmax</li>
    <li>weather</li>
</ol>

# Gitlab

```
https://github.com/CharlesPeslerbe/apiMeteo
```