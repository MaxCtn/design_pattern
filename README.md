# design_pattern
## Observer

### Définition : 

Le design pattern "__Observer__" est l'un des pattern java le plus utile et utilisé. Le design patern Observer fait parti des modèles de conception comportementaux, c'est a dire qu'il spécifie la communication entre les objects dit observables et les objets observateurs.
L'object appellé observables appellé Subject permet d'informer les observateurs d'un changement d'état, par exemple, une agence de presse peut avertir les chaînes lorsqu'elle reçoit des informations.
Il est utile lorsque vous êtes intéressé par l'état d'un objet et que vous souhaitez être notifié lorsqu'il y a un changement. 

Le modèle de conception de l'observateur est aussi connu sous le nom de modèle publication-abonnement.
Le design patern de l'observateur peut appellé avec :

- java.util.EventListener dans Swing
- javax.servlet.http.HttpSessionBindingListener
- javax.servlet.http.HttpSessionAttributeListener

### Mais comment fonctionne-t-il ? 

  
  Le modèle d'observateur utilise trois classes (Subject, Observer et CLient). Dans la classe Subject nous avons un object avec des méthodes qui permettent d'attacher et de détacher des obsereurs avec un client.

Méthodes :

  addObserver (…) : permet d’ajouter un objet « observer » à la collection des objets qui veulent être notifiés. <br>
  removeObserver (…) : permet de supprimer un « observer » depuis cette collection et donc le désinscrire. <br>
  notifierObservers (…) : cette méthode est la plus importante elle doit être appelée à chaque modification de l'état, elle permet au objects souhaitant être au courant du   changement d'états les informations qui lui sont utiles <br>
  update(…) : cette méthode est appelé a chaque modification d'état afin de donner la nouvelle information. <br>

En résumer, dans une classe qui doit déclencher des événements, on doit y ajouter:
    
    En attribut : une liste d'Observateurs
    Une méthode permettant d'ajouter un Observateur dans la liste   
    Une méthode permettant d'envoyer un signal a tous ses obsevateurs.
  
  
      
    



    
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

