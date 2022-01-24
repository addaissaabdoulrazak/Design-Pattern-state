# Design-Pattern-state
Objectif du patron: Changer le comportement  d'un objet selon son état Interne.
Resultat: Ce DP permet d'isoler les algorithmes propre a chaque etat d'un objet.
Liens avec les autres patrons: L’État peut être considéré comme une extension de la Stratégie. Ces deux patrons de conception sont basés sur la composition : ils changent le comportement du contexte en déléguant certaines tâches aux objets assistant. La stratégie rend ces objets complètement indépendants sans aucune visibilité l’un sur l’autre. Cependant, l’état n’impose pas de restrictions sur les dépendances entre les états concrets, et leur laisse modifier l’état du contexte à volonté.
