# design_pattern
## Observer

### Définition : 

Le design pattern "__Observer__" est l'un des pattern java le plus utile et utilisé.
Il est utilisé pour envoyer un signal à des modules qui jouent le rôle d'observateurs. En cas de notification, les observateurs effectuent alors l'action adéquate en fonction des informations qui parviennent depuis les modules qu'ils observent (les observables). On l'utilise principalement lorsque l'on doit gérer des évènements.

### Mais comment fonctionne-t-il ? 
Dans une classe qui doit déclencher des événements, on doit y ajouter:

    En attribut : une liste d'Observateurs
    Une méthode permettant d'ajouter un Observateur dans la liste
    Une méthode permettant d'envoyer un signal à tous ses obsevateurs.
    
"Observateur" est une classe abstraite avec une méthode signale dont héritent des observateurs "concrets" qui implémentent cette méthode.




--------------------------------------------------------------------------------------------------------------------------------------------------------------
## Singleton

### Définition : 

Le design pattern "__Singleton__" est lui aussi l'un des designs patterns le plus utlisé.
Il répond à plusieurs exigences, l'une des plus importantes est que celui-ci doit doit s'assurer qu'une classe ne puisse produire qu'une seule et unique instance.

### Mais comment fonctionne-t-il ? 


Afin de garantir l'unicité du Singleton, il est nécessaire de contrôler strictement son processus d'instanciation. C'est pourquoi il faut retirer la possibilité de produire des instances de la classe et la possibilité d'utiliser l'opérateur "new" en rendant le constructeur de la classe privé. Afin de récupérer notre unique instance, nous utiliserons la méthode statique getInstance.

Voici une implémentation de ce pattern : 


```java
public class Singleton
{   
    /** Constructeur privé */
    private Singleton()
    {}
 
    /** Instance unique pré-initialisée */
    private static Singleton INSTANCE = new Singleton();
     
    /** Point d'accès pour l'instance unique du singleton */
    public static Singleton getInstance()
    {   
      return INSTANCE;
    }
}
```

![image](https://user-images.githubusercontent.com/91802050/205171202-f4076789-429f-4198-a7ee-18f93e3b485f.png)

